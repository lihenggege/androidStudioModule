package com.github.lihenggege.androidstudiomodule.services

import com.github.lihenggege.androidstudiomodule.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
