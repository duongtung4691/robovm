/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.addressbook;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;

import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AddressBook")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ABPerson/*</name>*/ 
    extends /*<extends>*/ABRecord/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(ABPerson.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    public String getFirstName() {
        CFString val = (CFString)getValue(ABPersonProperty.FirstName);
        return val.toString();
    }
    public void setFirstName(String firstName) {
        setValue(ABPersonProperty.FirstName, new CFString(firstName));
    }
    public String getLastName() {
        CFString val = (CFString)getValue(ABPersonProperty.LastName);
        return val.toString();
    }
    public void setLastName(String lastName) {
        setValue(ABPersonProperty.LastName, new CFString(lastName));
    }
    public String getMiddleName() {
        CFString val = (CFString)getValue(ABPersonProperty.MiddleName);
        return val.toString();
    }
    public void setMiddleName(String middleName) {
        setValue(ABPersonProperty.MiddleName, new CFString(middleName));
    }
    public String getPrefix() {
        CFString val = (CFString)getValue(ABPersonProperty.Prefix);
        return val.toString();
    }
    public void setPrefix(String prefix) {
        setValue(ABPersonProperty.Prefix, new CFString(prefix));
    }
    public String getSuffix() {
        CFString val = (CFString)getValue(ABPersonProperty.Suffix);
        return val.toString();
    }
    public void setSuffix(String suffix) {
        setValue(ABPersonProperty.Suffix, new CFString(suffix));
    }
    public String getNickname() {
        CFString val = (CFString)getValue(ABPersonProperty.Nickname);
        return val.toString();
    }
    public void setNickname(String nickname) {
        setValue(ABPersonProperty.Nickname, new CFString(nickname));
    }
    public String getFirstNamePhonetic() {
        CFString val = (CFString)getValue(ABPersonProperty.FirstNamePhonetic);
        return val.toString();
    }
    public void setFirstNamePhonetic(String firstNamePhonetic) {
        setValue(ABPersonProperty.FirstNamePhonetic, new CFString(firstNamePhonetic));
    }
    public String getLastNamePhonetic() {
        CFString val = (CFString)getValue(ABPersonProperty.LastNamePhonetic);
        return val.toString();
    }
    public void setLastNamePhonetic(String lastNamePhonetic) {
        setValue(ABPersonProperty.LastNamePhonetic, new CFString(lastNamePhonetic));
    }
    public String getMiddleNamePhonetic() {
        CFString val = (CFString)getValue(ABPersonProperty.MiddleNamePhonetic);
        return val.toString();
    }
    public void setMiddleNamePhonetic(String middleNamePhonetic) {
        setValue(ABPersonProperty.MiddleNamePhonetic, new CFString(middleNamePhonetic));
    }
    public String getOrganization() {
        CFString val = (CFString)getValue(ABPersonProperty.Organization);
        return val.toString();
    }
    public void setOrganization(String organization) {
        setValue(ABPersonProperty.Organization, new CFString(organization));
    }
    public String getJobTitle() {
        CFString val = (CFString)getValue(ABPersonProperty.JobTitle);
        return val.toString();
    }
    public void setJobTitle(String jobTitle) {
        setValue(ABPersonProperty.JobTitle, new CFString(jobTitle));
    }
    public String getDepartment() {
        CFString val = (CFString)getValue(ABPersonProperty.Department);
        return val.toString();
    }
    public void setDepartment(String department) {
        setValue(ABPersonProperty.Department, new CFString(department));
    }
    public List<ABPersonEmailAddress> getEmailAddresses() {
        ABMultiValue val = (ABMultiValue)getValue(ABPersonProperty.Email);
        List<ABPersonEmailAddress> list = new ArrayList<>();
        long size = val.getCount();
        for (int i = 0; i < size; i++) {
            CFString address = (CFString)val.getValue(i);
            CFString label = (CFString)val.getLabel(i);
            list.add(new ABPersonEmailAddress(address, label));
        }
        return list;
    }
    public void setEmailAddresses(List<ABPersonEmailAddress> emailAddresses) {
        ABMutableMultiValue val = ABMutableMultiValue.create(ABPropertyType.MultiString);
        for (ABPersonEmailAddress address : emailAddresses) {
            val.addValueAndLabel(address.getAddress0(), address.getLabel0(), null);
        }
        setValue(ABPersonProperty.Email, val);
    }
    public NSDate getBirthday() {
        NSDate val = (NSDate)getNSValue(ABPersonProperty.Birthday);
        return val;
    }
    public void setBirthday(NSDate birthday) {
        setNSValue(ABPersonProperty.Birthday, birthday);
    }
    public String getNote() {
        CFString val = (CFString)getValue(ABPersonProperty.Note);
        return val.toString();
    }
    public void setNote(String note) {
        setValue(ABPersonProperty.Note, new CFString(note));
    }
    public NSDate getCreationDate() {
        NSDate val = (NSDate)getNSValue(ABPersonProperty.CreationDate);
        return val;
    }
    public void setCreationDate(NSDate creationDate) {
        setNSValue(ABPersonProperty.CreationDate, creationDate);
    }
    public NSDate getModificationDate() {
        NSDate val = (NSDate)getNSValue(ABPersonProperty.ModificationDate);
        return val;
    }
    public void setModificationDate(NSDate modificationDate) {
        setNSValue(ABPersonProperty.ModificationDate, modificationDate);
    }
    @SuppressWarnings("unchecked")
    public List<ABPersonAddress> getAddresses() {
        ABMultiValue val = (ABMultiValue)getValue(ABPersonProperty.Address);
        List<ABPersonAddress> list = new ArrayList<ABPersonAddress>();
        long size = val.getCount();
        for (int i = 0; i < size; i++) {
            NSDictionary<NSString, NSString> address = (NSDictionary<NSString, NSString>)val.getNSValue(i);
            CFString label = val.getLabel(i);
            list.add(new ABPersonAddress(address, label));
        }
        return list;
    }
    public void setAddresses(List<ABPersonAddress> addresses) {
        ABMutableMultiValue val = ABMutableMultiValue.create(ABPropertyType.MultiDictionary);
        for (ABPersonAddress address : addresses) {
            val.addNSValueAndLabel(address.getDictionary(), address.getLabel0(), null);
        }
        setValue(ABPersonProperty.Address, val);
    }
//    public List<ABPersonDate> getDates() { TODO
//        
//    } 
//    public void setDates(List<ABPersonDate> dates) {
//        
//    }
//    public ABPersonKind getKind() {
//        
//    }
//    public void setKind(ABPersonKind kind) {
//        
//    }
//    public List<ABPersonPhoneNumber> getPhoneNumbers() {
//        
//    }
//    public void setPhoneNumbers(List<ABPersonPhoneNumber> phoneNumbers) {
//        
//    }
//    public List<ABPersonInstantMessagingAccount> getInstantMessagingAccounts() {
//        
//    }
//    public void setInstantMessagingAccounts(List<ABPersonInstantMessagingAccount> instantMessagingAccounts) {
//        
//    }
//    public List<ABPersonSocialProfile> getSocialProfiles() {
//        
//    }
//    public void setSocialProfiles(List<ABPersonSocialProfile> socialProfiles) {
//        
//    }
//    public List<ABPersonURL> getURLs() {
//        
//    }
//    public void setURLs(List<ABPersonURL> urls) {
//        
//    }
//    public List<ABPersonRelatedName> getRelatedNames() {
//        
//    }
//    public void setRelatedNames(List<ABPersonRelatedName> relatedNames) {
//        
//    }
    
    public boolean setImageData(NSData imageData) {
        return setImageData(imageData, null);
    }
    public boolean removeImageData() {
        return removeImageData(null);
    }
    /*<methods>*/
    @Bridge(symbol="ABPersonCreate", optional=true)
    public static native ABRecord create();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="ABPersonCreateInSource", optional=true)
    public static native ABPerson create(ABSource source);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="ABPersonCopySource", optional=true)
    public native ABRecord getSource();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="ABPersonCopyArrayOfAllLinkedPeople", optional=true)
    public native NSArray<?> getAllLinkedPeople();
    @Bridge(symbol="ABPersonGetSortOrdering", optional=true)
    public static native ABPersonSortOrdering getSortOrdering();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Bridge(symbol="ABPersonGetCompositeNameFormat", optional=true)
    public static native ABPersonCompositeNameFormat getConstantCompositeNameFormat();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Bridge(symbol="ABPersonGetCompositeNameFormatForRecord", optional=true)
    public native ABPersonCompositeNameFormat getCompositeNameFormat();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Bridge(symbol="ABPersonCopyCompositeNameDelimiterForRecord", optional=true)
    public native String getCompositeNameDelimiter();
    @Bridge(symbol="ABPersonSetImageData", optional=true)
    protected native boolean setImageData(NSData imageData, NSError.NSErrorPtr error);
    @Bridge(symbol="ABPersonCopyImageData", optional=true)
    public native NSData getImageData();
    /**
     * @since Available in iOS 4.1 and later.
     */
    @Bridge(symbol="ABPersonCopyImageDataWithFormat", optional=true)
    public native NSData getImageData(ABPersonImageFormat format);
    @Bridge(symbol="ABPersonHasImageData", optional=true)
    public native boolean hasImageData();
    @Bridge(symbol="ABPersonRemoveImageData", optional=true)
    protected native boolean removeImageData(NSError.NSErrorPtr error);
    @Bridge(symbol="ABPersonComparePeopleByName", optional=true)
    public native CFComparisonResult compareTo(ABRecord person2, ABPersonSortOrdering ordering);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Bridge(symbol="ABPersonCreatePeopleInSourceWithVCardRepresentation", optional=true)
    public static native NSArray<?> createPeopleInSource(ABSource source, NSData vCardData);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Bridge(symbol="ABPersonCreateVCardRepresentationWithPeople", optional=true)
    public static native NSData createVCardRepresentation(NSArray<?> people);
    /*</methods>*/
}
