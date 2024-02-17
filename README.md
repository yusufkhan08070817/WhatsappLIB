#  $${\color{green}WhatsappLIB}$$ 
### WhatsappLIB is a simple library for Android that enables users to send messages to WhatsApp directly from your application.
# SS{\color{green}Installation}$$
#Add the following repository to your root build.gradle file:
```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
Then, add the dependency to your module-level build.gradle file:
```
dependencies {
    implementation 'com.github.yusufkhan08070817:WhatsappLIB:1.0.0'
}
```
# $${\color{green}Usage}$$
### To send a message to WhatsApp from your app, use the following method:

```
Whatsapp.sendMessage("+xx xxxxxxxxxx", this);
```
### Replace +xx xxxxxxxxxx with the recipient's phone number.
# Support
### If you encounter any issues or have any questions about using WhatsappLIB, please open an issue on the Github repository.

# License
### This library is licensed under the MIT License. See the LICENSE file for details.
--
### Feel free to contribute and improve this library. Happy coding! 🚀
