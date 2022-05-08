import requests

htmlGeneratorAppURL = "http://localhost:8080/generateHtmlRgbDisplayCode"

def callHtmlCodeGeneratorApp(rgbValue, text):

    request = {'rgbValue': rgbValue, 'text': text}
    response = requests.post(htmlGeneratorAppURL, json=request)
    return response
