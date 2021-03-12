__Setting up__

Install Intellij IDEA. https://www.jetbrains.com/idea/download/#section=windows (community is fine, if you don't have a work license)

You then have two options either install java yourself or let the IDE manage it.

To install it yourself just grab it from here : https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/windows-7-install.html

To let the IDE manage it, you will have to import the project first (see below).


__Running the tests__

Open the project root in IntelliJ using `File --> New --> Project from existing sources` it *should* pick up gradle
automatically, if not then you will have to select it in the import settings.

If you don't have java at this point then your IDE will complain and walk you through installing it.
Otherwise `File -> Project structure -> Project SDK --> Add SDK --> Download SDK` default values are fine.

When the IDE opens, there is a gradle tab on the right hand side. Open the and click on `verification --> test`.
If the right hand side is not there then a pop should appear at the bottom asking to import the gradle project.