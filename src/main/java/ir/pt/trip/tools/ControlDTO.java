package ir.pt.trip.tools;

/**
 * Created by Safarifar on 01/09/2017.
 */
public class ControlDTO {
    private String className;
    private String type;
    private String key;
    private TemplateOption templateOptions;
    private String selectedControl;
    private String subtype;
    private Boolean edited;
    private String cssClass;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public TemplateOption getTemplateOptions() {
        return templateOptions;
    }

    public void setTemplateOptions(TemplateOption templateOptions) {
        this.templateOptions = templateOptions;
    }

    public String getSelectedControl() {
        return selectedControl;
    }

    public void setSelectedControl(String selectedControl) {
        this.selectedControl = selectedControl;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public Boolean getEdited() {
        return edited;
    }

    public void setEdited(Boolean edited) {
        this.edited = edited;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public String toHtml() {
        String elementDomStr = "<div %s> %s </div>",
                attributeHtmlStr = "",
                innerHtmlStr = "";
        if (!this.getClassName().isEmpty()) {
            attributeHtmlStr += "class=\"" + (this.getTemplateOptions() != null && this.getTemplateOptions().getRequired() == true ?
                    this.getClassName() + " required" :
                    this.getClassName()) + "\"";
        }
        if (this.getTemplateOptions() != null) {
            if (!this.getTemplateOptions().getLabel().isEmpty()) {
                innerHtmlStr += "<label class=\"col-md-6 col-sm-6 col-xs-12 pull-right control-label right\">" + this.getTemplateOptions().getLabel() + "</label>";

                innerHtmlStr += "<input  tabindex=\"1\" \n" +
                        /*" ng-disabled=\"!isEditable\" " +
                        " validation=\"required\" " +
                        " validation-error-to=\"EnglishTitleError\" " +*/
                        " serviceStatus=\"" + getType(this.getSelectedControl()) + "\"" +
                        " class=\"form-control right\" " +
                        " placeholder=\"" + this.getTemplateOptions().getPlaceholder() + "\"" +
                        " name=\"" + this.getTemplateOptions().getFormlyBindModel() + "\"" +
                        " id=\"" + this.getTemplateOptions().getFormlyBindModel() + "\"" +
                        " ng-model=\"formItem." + this.getTemplateOptions().getFormlyBindModel() + "\">";
            }
        }
        return String.format(elementDomStr, attributeHtmlStr, innerHtmlStr);
    }

    private String getType(String inputType) {
        switch (inputType) {
            case "TextInput":
                return "text";
            case "Password":
                return "password";
            case "Date":
                return "date";
            case "Radio":
                return "radio";
            case "Email":
                return "email";
            default:
                return "text";
        }
    }

    public static class TemplateOption {
        private String label;
        private Boolean required;
        private String description;
        private String placeholder;
        private String[] options;
        private String formlyBindModel;
        private String datepickerPopup;

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public Boolean getRequired() {
            return required;
        }

        public void setRequired(Boolean required) {
            this.required = required;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPlaceholder() {
            return placeholder;
        }

        public void setPlaceholder(String placeholder) {
            this.placeholder = placeholder;
        }

        public String[] getOptions() {
            return options;
        }

        public void setOptions(String[] options) {
            this.options = options;
        }

        public String getFormlyBindModel() {
            return formlyBindModel;
        }

        public void setFormlyBindModel(String formlyBindModel) {
            this.formlyBindModel = formlyBindModel;
        }

        public String getDatepickerPopup() {
            return datepickerPopup;
        }

        public void setDatepickerPopup(String datepickerPopup) {
            this.datepickerPopup = datepickerPopup;
        }
    }
}

