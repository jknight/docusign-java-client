package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.MergeField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Email
 */

public class Email {
  @JsonProperty("anchorCaseSensitive")
  private String anchorCaseSensitive = null;

  @JsonProperty("anchorHorizontalAlignment")
  private String anchorHorizontalAlignment = null;

  @JsonProperty("anchorIgnoreIfNotPresent")
  private String anchorIgnoreIfNotPresent = null;

  @JsonProperty("anchorMatchWholeWord")
  private String anchorMatchWholeWord = null;

  @JsonProperty("anchorString")
  private String anchorString = null;

  @JsonProperty("anchorUnits")
  private String anchorUnits = null;

  @JsonProperty("anchorXOffset")
  private String anchorXOffset = null;

  @JsonProperty("anchorYOffset")
  private String anchorYOffset = null;

  @JsonProperty("bold")
  private String bold = null;

  @JsonProperty("concealValueOnDocument")
  private String concealValueOnDocument = null;

  @JsonProperty("conditionalParentLabel")
  private String conditionalParentLabel = null;

  @JsonProperty("conditionalParentValue")
  private String conditionalParentValue = null;

  @JsonProperty("customTabId")
  private String customTabId = null;

  @JsonProperty("disableAutoSize")
  private String disableAutoSize = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("font")
  private String font = null;

  @JsonProperty("fontColor")
  private String fontColor = null;

  @JsonProperty("fontSize")
  private String fontSize = null;

  @JsonProperty("italic")
  private String italic = null;

  @JsonProperty("locked")
  private String locked = null;

  @JsonProperty("maxLength")
  private Integer maxLength = null;

  @JsonProperty("mergeField")
  private MergeField mergeField = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("originalValue")
  private String originalValue = null;

  @JsonProperty("pageNumber")
  private String pageNumber = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("requireAll")
  private String requireAll = null;

  @JsonProperty("required")
  private String required = null;

  @JsonProperty("requireInitialOnSharedChange")
  private String requireInitialOnSharedChange = null;

  @JsonProperty("senderRequired")
  private String senderRequired = null;

  @JsonProperty("shared")
  private String shared = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("tabGroupLabels")
  private java.util.List<String> tabGroupLabels = new java.util.ArrayList<String>();

  @JsonProperty("tabId")
  private String tabId = null;

  @JsonProperty("tabLabel")
  private String tabLabel = null;

  @JsonProperty("tabOrder")
  private String tabOrder = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("tooltip")
  private String tooltip = null;

  @JsonProperty("underline")
  private String underline = null;

  @JsonProperty("validationMessage")
  private String validationMessage = null;

  @JsonProperty("validationPattern")
  private String validationPattern = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("width")
  private Integer width = null;

  @JsonProperty("xPosition")
  private String xPosition = null;

  @JsonProperty("yPosition")
  private String yPosition = null;

  public Email anchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
    return this;
  }

   /**
   * When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.
   * @return anchorCaseSensitive
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.")
  public String getAnchorCaseSensitive() {
    return anchorCaseSensitive;
  }

  public void setAnchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
  }

  public Email anchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
    return this;
  }

   /**
   * Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.
   * @return anchorHorizontalAlignment
  **/
  @ApiModelProperty(example = "null", value = "Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.")
  public String getAnchorHorizontalAlignment() {
    return anchorHorizontalAlignment;
  }

  public void setAnchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
  }

  public Email anchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
    return this;
  }

   /**
   * When set to **true**, this tab is ignored if anchorString is not found in the document.
   * @return anchorIgnoreIfNotPresent
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, this tab is ignored if anchorString is not found in the document.")
  public String getAnchorIgnoreIfNotPresent() {
    return anchorIgnoreIfNotPresent;
  }

  public void setAnchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
  }

  public Email anchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
    return this;
  }

   /**
   * When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.
   * @return anchorMatchWholeWord
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.")
  public String getAnchorMatchWholeWord() {
    return anchorMatchWholeWord;
  }

  public void setAnchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
  }

  public Email anchorString(String anchorString) {
    this.anchorString = anchorString;
    return this;
  }

   /**
   * Anchor text information for a radio button.
   * @return anchorString
  **/
  @ApiModelProperty(example = "null", value = "Anchor text information for a radio button.")
  public String getAnchorString() {
    return anchorString;
  }

  public void setAnchorString(String anchorString) {
    this.anchorString = anchorString;
  }

  public Email anchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
    return this;
  }

   /**
   * Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.
   * @return anchorUnits
  **/
  @ApiModelProperty(example = "null", value = "Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.")
  public String getAnchorUnits() {
    return anchorUnits;
  }

  public void setAnchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
  }

  public Email anchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
    return this;
  }

   /**
   * Specifies the X axis location of the tab, in anchorUnits, relative to the anchorString.
   * @return anchorXOffset
  **/
  @ApiModelProperty(example = "null", value = "Specifies the X axis location of the tab, in anchorUnits, relative to the anchorString.")
  public String getAnchorXOffset() {
    return anchorXOffset;
  }

  public void setAnchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
  }

  public Email anchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
    return this;
  }

   /**
   * Specifies the Y axis location of the tab, in anchorUnits, relative to the anchorString.
   * @return anchorYOffset
  **/
  @ApiModelProperty(example = "null", value = "Specifies the Y axis location of the tab, in anchorUnits, relative to the anchorString.")
  public String getAnchorYOffset() {
    return anchorYOffset;
  }

  public void setAnchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
  }

  public Email bold(String bold) {
    this.bold = bold;
    return this;
  }

   /**
   * When set to **true**, the information in the tab is bold.
   * @return bold
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the information in the tab is bold.")
  public String getBold() {
    return bold;
  }

  public void setBold(String bold) {
    this.bold = bold;
  }

  public Email concealValueOnDocument(String concealValueOnDocument) {
    this.concealValueOnDocument = concealValueOnDocument;
    return this;
  }

   /**
   * When set to **true**, the field appears normally while the recipient is adding or modifying the information in the field, but the data is not visible (the characters are hidden by asterisks) to any other signer or the sender.  When an envelope is completed the information is available to the sender through the Form Data link in the DocuSign Console.  This setting applies only to text boxes and does not affect list boxes, radio buttons, or check boxes.
   * @return concealValueOnDocument
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the field appears normally while the recipient is adding or modifying the information in the field, but the data is not visible (the characters are hidden by asterisks) to any other signer or the sender.  When an envelope is completed the information is available to the sender through the Form Data link in the DocuSign Console.  This setting applies only to text boxes and does not affect list boxes, radio buttons, or check boxes.")
  public String getConcealValueOnDocument() {
    return concealValueOnDocument;
  }

  public void setConcealValueOnDocument(String concealValueOnDocument) {
    this.concealValueOnDocument = concealValueOnDocument;
  }

  public Email conditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
    return this;
  }

   /**
   * For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.
   * @return conditionalParentLabel
  **/
  @ApiModelProperty(example = "null", value = "For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.")
  public String getConditionalParentLabel() {
    return conditionalParentLabel;
  }

  public void setConditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
  }

  public Email conditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
    return this;
  }

   /**
   * For conditional fields, this is the value of the parent tab that controls the tab's visibility.  If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active. 
   * @return conditionalParentValue
  **/
  @ApiModelProperty(example = "null", value = "For conditional fields, this is the value of the parent tab that controls the tab's visibility.  If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active. ")
  public String getConditionalParentValue() {
    return conditionalParentValue;
  }

  public void setConditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
  }

  public Email customTabId(String customTabId) {
    this.customTabId = customTabId;
    return this;
  }

   /**
   * The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.
   * @return customTabId
  **/
  @ApiModelProperty(example = "null", value = "The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.")
  public String getCustomTabId() {
    return customTabId;
  }

  public void setCustomTabId(String customTabId) {
    this.customTabId = customTabId;
  }

  public Email disableAutoSize(String disableAutoSize) {
    this.disableAutoSize = disableAutoSize;
    return this;
  }

   /**
   * When set to **true**, disables the auto sizing of single line text boxes in the signing screen when the signer enters data. If disabled users will only be able enter as much data as the text box can hold. By default this is false. This property only affects single line text boxes.
   * @return disableAutoSize
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, disables the auto sizing of single line text boxes in the signing screen when the signer enters data. If disabled users will only be able enter as much data as the text box can hold. By default this is false. This property only affects single line text boxes.")
  public String getDisableAutoSize() {
    return disableAutoSize;
  }

  public void setDisableAutoSize(String disableAutoSize) {
    this.disableAutoSize = disableAutoSize;
  }

  public Email documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   * @return documentId
  **/
  @ApiModelProperty(example = "null", value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public Email errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public Email font(String font) {
    this.font = font;
    return this;
  }

   /**
   * The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.
   * @return font
  **/
  @ApiModelProperty(example = "null", value = "The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.")
  public String getFont() {
    return font;
  }

  public void setFont(String font) {
    this.font = font;
  }

  public Email fontColor(String fontColor) {
    this.fontColor = fontColor;
    return this;
  }

   /**
   * The font color used for the information in the tab.  Possible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.
   * @return fontColor
  **/
  @ApiModelProperty(example = "null", value = "The font color used for the information in the tab.  Possible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.")
  public String getFontColor() {
    return fontColor;
  }

  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  public Email fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * The font size used for the information in the tab.  Possible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.
   * @return fontSize
  **/
  @ApiModelProperty(example = "null", value = "The font size used for the information in the tab.  Possible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.")
  public String getFontSize() {
    return fontSize;
  }

  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }

  public Email italic(String italic) {
    this.italic = italic;
    return this;
  }

   /**
   * When set to **true**, the information in the tab is italic.
   * @return italic
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the information in the tab is italic.")
  public String getItalic() {
    return italic;
  }

  public void setItalic(String italic) {
    this.italic = italic;
  }

  public Email locked(String locked) {
    this.locked = locked;
    return this;
  }

   /**
   * When set to **true**, the signer cannot change the data of the custom tab.
   * @return locked
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the signer cannot change the data of the custom tab.")
  public String getLocked() {
    return locked;
  }

  public void setLocked(String locked) {
    this.locked = locked;
  }

  public Email maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * An optional value that describes the maximum length of the property when the property is a string.
   * @return maxLength
  **/
  @ApiModelProperty(example = "null", value = "An optional value that describes the maximum length of the property when the property is a string.")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public Email mergeField(MergeField mergeField) {
    this.mergeField = mergeField;
    return this;
  }

   /**
   * Get mergeField
   * @return mergeField
  **/
  @ApiModelProperty(example = "null", value = "")
  public MergeField getMergeField() {
    return mergeField;
  }

  public void setMergeField(MergeField mergeField) {
    this.mergeField = mergeField;
  }

  public Email name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Email originalValue(String originalValue) {
    this.originalValue = originalValue;
    return this;
  }

   /**
   * The initial value of the tab when it was sent to the recipient. 
   * @return originalValue
  **/
  @ApiModelProperty(example = "null", value = "The initial value of the tab when it was sent to the recipient. ")
  public String getOriginalValue() {
    return originalValue;
  }

  public void setOriginalValue(String originalValue) {
    this.originalValue = originalValue;
  }

  public Email pageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Specifies the page number on which the tab is located.
   * @return pageNumber
  **/
  @ApiModelProperty(example = "null", value = "Specifies the page number on which the tab is located.")
  public String getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

  public Email recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   * @return recipientId
  **/
  @ApiModelProperty(example = "null", value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public Email requireAll(String requireAll) {
    this.requireAll = requireAll;
    return this;
  }

   /**
   * When set to **true** and shared is true, information must be entered in this field to complete the envelope. 
   * @return requireAll
  **/
  @ApiModelProperty(example = "null", value = "When set to **true** and shared is true, information must be entered in this field to complete the envelope. ")
  public String getRequireAll() {
    return requireAll;
  }

  public void setRequireAll(String requireAll) {
    this.requireAll = requireAll;
  }

  public Email required(String required) {
    this.required = required;
    return this;
  }

   /**
   * When set to **true**, the signer is required to fill out this tab
   * @return required
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the signer is required to fill out this tab")
  public String getRequired() {
    return required;
  }

  public void setRequired(String required) {
    this.required = required;
  }

  public Email requireInitialOnSharedChange(String requireInitialOnSharedChange) {
    this.requireInitialOnSharedChange = requireInitialOnSharedChange;
    return this;
  }

   /**
   * Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.
   * @return requireInitialOnSharedChange
  **/
  @ApiModelProperty(example = "null", value = "Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.")
  public String getRequireInitialOnSharedChange() {
    return requireInitialOnSharedChange;
  }

  public void setRequireInitialOnSharedChange(String requireInitialOnSharedChange) {
    this.requireInitialOnSharedChange = requireInitialOnSharedChange;
  }

  public Email senderRequired(String senderRequired) {
    this.senderRequired = senderRequired;
    return this;
  }

   /**
   * When set to **true**, the sender must populate the tab before an envelope can be sent using the template.   This value tab can only be changed by modifying (PUT) the template.   Tabs with a `senderRequired` value of true cannot be deleted from an envelope.
   * @return senderRequired
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender must populate the tab before an envelope can be sent using the template.   This value tab can only be changed by modifying (PUT) the template.   Tabs with a `senderRequired` value of true cannot be deleted from an envelope.")
  public String getSenderRequired() {
    return senderRequired;
  }

  public void setSenderRequired(String senderRequired) {
    this.senderRequired = senderRequired;
  }

  public Email shared(String shared) {
    this.shared = shared;
    return this;
  }

   /**
   * When set to **true**, this custom tab is shared.
   * @return shared
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, this custom tab is shared.")
  public String getShared() {
    return shared;
  }

  public void setShared(String shared) {
    this.shared = shared;
  }

  public Email status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Email tabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
    return this;
  }

  public Email addTabGroupLabelsItem(String tabGroupLabelsItem) {
    this.tabGroupLabels.add(tabGroupLabelsItem);
    return this;
  }

   /**
   * 
   * @return tabGroupLabels
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getTabGroupLabels() {
    return tabGroupLabels;
  }

  public void setTabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
  }

  public Email tabId(String tabId) {
    this.tabId = tabId;
    return this;
  }

   /**
   * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     
   * @return tabId
  **/
  @ApiModelProperty(example = "null", value = "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     ")
  public String getTabId() {
    return tabId;
  }

  public void setTabId(String tabId) {
    this.tabId = tabId;
  }

  public Email tabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
    return this;
  }

   /**
   * The label string associated with the tab.
   * @return tabLabel
  **/
  @ApiModelProperty(example = "null", value = "The label string associated with the tab.")
  public String getTabLabel() {
    return tabLabel;
  }

  public void setTabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
  }

  public Email tabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
    return this;
  }

   /**
   * 
   * @return tabOrder
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTabOrder() {
    return tabOrder;
  }

  public void setTabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
  }

  public Email templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

   /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. 
   * @return templateLocked
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
  public String getTemplateLocked() {
    return templateLocked;
  }

  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }

  public Email templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

   /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
   * @return templateRequired
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  public String getTemplateRequired() {
    return templateRequired;
  }

  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }

  public Email tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

   /**
   * 
   * @return tooltip
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTooltip() {
    return tooltip;
  }

  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  public Email underline(String underline) {
    this.underline = underline;
    return this;
  }

   /**
   * When set to **true**, the information in the tab is underlined.
   * @return underline
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the information in the tab is underlined.")
  public String getUnderline() {
    return underline;
  }

  public void setUnderline(String underline) {
    this.underline = underline;
  }

  public Email validationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
    return this;
  }

   /**
   * The message displayed if the custom tab fails input validation (either custom of embedded).
   * @return validationMessage
  **/
  @ApiModelProperty(example = "null", value = "The message displayed if the custom tab fails input validation (either custom of embedded).")
  public String getValidationMessage() {
    return validationMessage;
  }

  public void setValidationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
  }

  public Email validationPattern(String validationPattern) {
    this.validationPattern = validationPattern;
    return this;
  }

   /**
   * A regular expression used to validate input for the tab.
   * @return validationPattern
  **/
  @ApiModelProperty(example = "null", value = "A regular expression used to validate input for the tab.")
  public String getValidationPattern() {
    return validationPattern;
  }

  public void setValidationPattern(String validationPattern) {
    this.validationPattern = validationPattern;
  }

  public Email value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Specifies the value of the tab. 
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "Specifies the value of the tab. ")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Email width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the tab in pixels.
   * @return width
  **/
  @ApiModelProperty(example = "null", value = "Width of the tab in pixels.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public Email xPosition(String xPosition) {
    this.xPosition = xPosition;
    return this;
  }

   /**
   * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.
   * @return xPosition
  **/
  @ApiModelProperty(example = "null", value = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public String getXPosition() {
    return xPosition;
  }

  public void setXPosition(String xPosition) {
    this.xPosition = xPosition;
  }

  public Email yPosition(String yPosition) {
    this.yPosition = yPosition;
    return this;
  }

   /**
   * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
   * @return yPosition
  **/
  @ApiModelProperty(example = "null", value = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public String getYPosition() {
    return yPosition;
  }

  public void setYPosition(String yPosition) {
    this.yPosition = yPosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Email email = (Email) o;
    return Objects.equals(this.anchorCaseSensitive, email.anchorCaseSensitive) &&
        Objects.equals(this.anchorHorizontalAlignment, email.anchorHorizontalAlignment) &&
        Objects.equals(this.anchorIgnoreIfNotPresent, email.anchorIgnoreIfNotPresent) &&
        Objects.equals(this.anchorMatchWholeWord, email.anchorMatchWholeWord) &&
        Objects.equals(this.anchorString, email.anchorString) &&
        Objects.equals(this.anchorUnits, email.anchorUnits) &&
        Objects.equals(this.anchorXOffset, email.anchorXOffset) &&
        Objects.equals(this.anchorYOffset, email.anchorYOffset) &&
        Objects.equals(this.bold, email.bold) &&
        Objects.equals(this.concealValueOnDocument, email.concealValueOnDocument) &&
        Objects.equals(this.conditionalParentLabel, email.conditionalParentLabel) &&
        Objects.equals(this.conditionalParentValue, email.conditionalParentValue) &&
        Objects.equals(this.customTabId, email.customTabId) &&
        Objects.equals(this.disableAutoSize, email.disableAutoSize) &&
        Objects.equals(this.documentId, email.documentId) &&
        Objects.equals(this.errorDetails, email.errorDetails) &&
        Objects.equals(this.font, email.font) &&
        Objects.equals(this.fontColor, email.fontColor) &&
        Objects.equals(this.fontSize, email.fontSize) &&
        Objects.equals(this.italic, email.italic) &&
        Objects.equals(this.locked, email.locked) &&
        Objects.equals(this.maxLength, email.maxLength) &&
        Objects.equals(this.mergeField, email.mergeField) &&
        Objects.equals(this.name, email.name) &&
        Objects.equals(this.originalValue, email.originalValue) &&
        Objects.equals(this.pageNumber, email.pageNumber) &&
        Objects.equals(this.recipientId, email.recipientId) &&
        Objects.equals(this.requireAll, email.requireAll) &&
        Objects.equals(this.required, email.required) &&
        Objects.equals(this.requireInitialOnSharedChange, email.requireInitialOnSharedChange) &&
        Objects.equals(this.senderRequired, email.senderRequired) &&
        Objects.equals(this.shared, email.shared) &&
        Objects.equals(this.status, email.status) &&
        Objects.equals(this.tabGroupLabels, email.tabGroupLabels) &&
        Objects.equals(this.tabId, email.tabId) &&
        Objects.equals(this.tabLabel, email.tabLabel) &&
        Objects.equals(this.tabOrder, email.tabOrder) &&
        Objects.equals(this.templateLocked, email.templateLocked) &&
        Objects.equals(this.templateRequired, email.templateRequired) &&
        Objects.equals(this.tooltip, email.tooltip) &&
        Objects.equals(this.underline, email.underline) &&
        Objects.equals(this.validationMessage, email.validationMessage) &&
        Objects.equals(this.validationPattern, email.validationPattern) &&
        Objects.equals(this.value, email.value) &&
        Objects.equals(this.width, email.width) &&
        Objects.equals(this.xPosition, email.xPosition) &&
        Objects.equals(this.yPosition, email.yPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorCaseSensitive, anchorHorizontalAlignment, anchorIgnoreIfNotPresent, anchorMatchWholeWord, anchorString, anchorUnits, anchorXOffset, anchorYOffset, bold, concealValueOnDocument, conditionalParentLabel, conditionalParentValue, customTabId, disableAutoSize, documentId, errorDetails, font, fontColor, fontSize, italic, locked, maxLength, mergeField, name, originalValue, pageNumber, recipientId, requireAll, required, requireInitialOnSharedChange, senderRequired, shared, status, tabGroupLabels, tabId, tabLabel, tabOrder, templateLocked, templateRequired, tooltip, underline, validationMessage, validationPattern, value, width, xPosition, yPosition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Email {\n");
    
    sb.append("    anchorCaseSensitive: ").append(toIndentedString(anchorCaseSensitive)).append("\n");
    sb.append("    anchorHorizontalAlignment: ").append(toIndentedString(anchorHorizontalAlignment)).append("\n");
    sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
    sb.append("    anchorMatchWholeWord: ").append(toIndentedString(anchorMatchWholeWord)).append("\n");
    sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
    sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
    sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
    sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    concealValueOnDocument: ").append(toIndentedString(concealValueOnDocument)).append("\n");
    sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
    sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
    sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
    sb.append("    disableAutoSize: ").append(toIndentedString(disableAutoSize)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    requireAll: ").append(toIndentedString(requireAll)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    requireInitialOnSharedChange: ").append(toIndentedString(requireInitialOnSharedChange)).append("\n");
    sb.append("    senderRequired: ").append(toIndentedString(senderRequired)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tabGroupLabels: ").append(toIndentedString(tabGroupLabels)).append("\n");
    sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
    sb.append("    tabOrder: ").append(toIndentedString(tabOrder)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
    sb.append("    validationMessage: ").append(toIndentedString(validationMessage)).append("\n");
    sb.append("    validationPattern: ").append(toIndentedString(validationPattern)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    xPosition: ").append(toIndentedString(xPosition)).append("\n");
    sb.append("    yPosition: ").append(toIndentedString(yPosition)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

