def generateRgb(request):
    return "rgb(" + str(request['red']) + ", " + str(request['green']) + ", " + str(request['blue']) + ")"