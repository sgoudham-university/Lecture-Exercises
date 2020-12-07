import requests


def main():
    request = requests.get(
        "https://youtube.googleapis.com/youtube/v3/channels?part=snippet%2CcontentDetails%2Cstatistics&forUsername=PewDiePie&key=AIzaSyBJZS13LE6VTNF7Ts3zcYwOOr60GmSyIIU")
    channel = request.json()

    list_of_channels = channel["items"]

    for channel in list_of_channels:
        print(channel["snippet"]["description"])


main()
