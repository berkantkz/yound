# yound
An Android app which downloads mp3 from YouTube

------

## Usage
* Open YouTube
* Find the music/sound whatever you want to download
* Click on share
* Choose Yound
And that's all. You'll be redirected to download page. Choose which quality you want to have there.

-----
#### Note:
You should add your own ```keystore.properties``` file to be able to build a signed apk. This file should contain required definitions as ```(do not add quotes except storeFile)```:

>* *storePassword=yourPasswordWithoutQuotes*
>* *keyPassword=PasswordAgainWithoutQuotes*
>* *keyAlias=yourAliasWithoutQuotes*
>* *storeFile="pathToTheStoredKeyFile"*