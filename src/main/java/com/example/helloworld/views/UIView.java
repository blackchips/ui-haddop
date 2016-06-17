package com.example.helloworld.views;

import io.dropwizard.views.View;

public class UIView extends View {

    public enum Template {
        JS("mustache/ui.mustache");

        private String templateName;

        Template(String templateName) {
            this.templateName = templateName;
        }

        public String getTemplateName() {
            return templateName;
        }
    }

    public UIView(UIView.Template template) {
        super(template.getTemplateName());

    }
}
