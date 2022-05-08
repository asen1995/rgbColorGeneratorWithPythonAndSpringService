from flask import Flask, request, jsonify, json
from marshmallow import ValidationError

from RgbGenerator import generateRgb
from RgbRequestSchema import RgbRequestSchema

app = Flask(__name__)

@app.after_request
def after_request(response):
  response.headers.add('Access-Control-Allow-Origin', '*')
  response.headers.add('Access-Control-Allow-Headers', 'Content-Type,Authorization')
  response.headers.add('Access-Control-Allow-Methods', 'GET,PUT,POST,DELETE,OPTIONS')
  return response

@app.route('/cssRgbGenerator', methods=['POST'])
def cssRgbGenerator():
    record = json.loads(request.data)
    schema = RgbRequestSchema()
    try:
        # Validate request body against schema data types
        result = schema.load(record)

        rgbValue = generateRgb(record)
        text = record['text']
        #     TODO make a call to Spring/JAX-RS. rest service with current values

        return jsonify("success"), 200

    except ValidationError as err:
        # Return a nice message if validation fails
        return jsonify(err.messages), 400


if __name__ == '__main__':
    app.run(debug=True)
