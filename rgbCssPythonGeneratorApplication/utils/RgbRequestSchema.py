from marshmallow import Schema, fields


class RgbRequestSchema(Schema):
    red = fields.Integer(required=True)
    green = fields.Integer(required=True)
    blue = fields.Integer(required=True)
    text = fields.String(required=True)