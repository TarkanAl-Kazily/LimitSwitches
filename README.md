# Limit-Switches

Robotics! Push button make metal go whrrrr.

---

### Setup

Click the "Fork" button in the top right, then proceed!

The `$` means "enter the bit after this at a command prompt or terminal.

```sh

$ cd ... # before you begin, `cd` and `mkdir` your way to a new folder you don't mind getting dirty.
$ git clone https://github.com/<YourUsernameHere>/LimitSwitches.git
$ cd LimitSwitches
$ git remote add upstream https://github.com/Spartronics4915/LimitSwitches.git

```

If you're on Mac or Linux, replace the word `gradlew.bat` with `./gradlew` in the next steps.

```

$ gradlew.bat wpi      # this downloads FIRST's "WPILib" toolkit
$ gradlew.bat jar      # this runs a test compile to ensure that your system is set up right.
$ gradlew.bat eclipse  # sets up eclipse project files

```

1. Open Eclipse.
1. `File` -> `Import` -> `General` -> `Existing Projects`
1. Browse for the root directory, select the `LimitSwitches` folder.
1. `Finish`.
1. ???
