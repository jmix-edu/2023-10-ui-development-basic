package com.company.jmixpm.screen.project;

import io.jmix.ui.screen.*;
import com.company.jmixpm.entity.Project;

@UiController("Project.edit")
@UiDescriptor("project-edit.xml")

@EditedEntityContainer("projectDc")
@PrimaryEditorScreen(Project.class)
public class ProjectEdit extends StandardEditor<Project> {
}