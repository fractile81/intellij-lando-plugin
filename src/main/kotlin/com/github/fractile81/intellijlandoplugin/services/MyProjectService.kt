package com.github.fractile81.intellijlandoplugin.services

import com.intellij.openapi.project.Project
import com.github.fractile81.intellijlandoplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
