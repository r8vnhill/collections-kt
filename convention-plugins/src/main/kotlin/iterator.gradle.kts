import tasks.ModuleSetupTask

tasks.register<ModuleSetupTask>("setupIteratorModule") {
    description = "Creates the base module and files for the iterator pattern lesson"
    module.set("iterator")

    doLast {
        createFiles(
            "iterator",
            main to "Iterator.kt",
            main to "Iterable.kt",
        )
        createFiles(
            "library",
            main to "Library.kt",
            main to "Book.kt",
            main to "BookIterator.kt",
        )
    }
}
