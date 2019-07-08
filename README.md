# vscode & docker sample

This is an example on how to use docker (or docker-compose) as a [dev environment on vscode](https://code.visualstudio.com/docs/remote/containers).

## What?

This is a clojure project. One of it's tests requires redis running. The idea is for you to be able to run the tests and generate the jar for running the project without:

- having java installed

- having clojure installed

- having any of the clojure or java 3rd party dependencies installed

- having redis running on your dev box

The only requirement is having docker up and running.

## Usage

- Open this project with a recent version of vscode. Update if in doubt.

- You will be prompted to reopen folder in container. Choose yes.

- After a while your editor should open.

- Open a Terminal (inside vscode) and run `lein test`, this should:
    - install missing dependencies
    - run tests, one of them against a running redis instance

- Open a Terminal (inside vscode) and run `lein uberjar`, this should:
    - install missing dependencies
    - after a while, generate a big fat jar `target/uberjar/sample-0.1.0-SNAPSHOT-standalone.jar`

- Optional: if you have java installed on your dev box, you can run that jar by doing `java -jar target/uberjar/sample-0.1.0-SNAPSHOT-standalone.jar`
