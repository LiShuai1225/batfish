package org.batfish.question.assertion;

public class Assertion {

   private boolean _asPathList;

   private String _assertion;

   private String _description;

   private boolean _summary;

   public boolean getAsPathList() {
      return _asPathList;
   }

   public String getAssertion() {
      return _assertion;
   }

   public String getDescription() {
      return _description;
   }

   public boolean getSummary() {
      return _summary;
   }

   public void setAsPathList(boolean asPathList) {
      _asPathList = asPathList;
   }

   public void setAssertion(String assertion) {
      _assertion = assertion;
   }

   public void setDescription(String description) {
      _description = description;
   }

   public void setSummary(boolean summary) {
      _summary = summary;
   }

}