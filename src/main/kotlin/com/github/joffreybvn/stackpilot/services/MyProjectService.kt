package com.github.joffreybvn.stackpilot.services

import com.intellij.openapi.project.Project
import com.github.joffreybvn.stackpilot.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
