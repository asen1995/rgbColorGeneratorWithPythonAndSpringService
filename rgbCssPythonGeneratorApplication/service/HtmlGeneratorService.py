import requests

htmlGeneratorAppURL = "http://localhost:8080/generateHtmlRgbDisplayCode"

def callHtmlCodeGeneratorApp(rgbValue, text):

    request = {'rgbValue': rgbValue, 'text': text}

    print('calling htmlGeneratorApp with request ' + str(request))
    response = requests.post(htmlGeneratorAppURL, json=request)
    return response
