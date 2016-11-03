
package com.kunai.keyvault.crypto.voltage.vibesimple;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataOut" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fullApplicationIdentityOut" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataOut",
    "fullApplicationIdentityOut"
})
@XmlRootElement(name = "ProtectCreditCardNumberV2Response")
public class ProtectCreditCardNumberV2Response {

    @XmlElement(required = true)
    protected String dataOut;
    @XmlElement(required = true)
    protected String fullApplicationIdentityOut;

    /**
     * Gets the value of the dataOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOut() {
        return dataOut;
    }

    /**
     * Sets the value of the dataOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOut(String value) {
        this.dataOut = value;
    }

    /**
     * Gets the value of the fullApplicationIdentityOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullApplicationIdentityOut() {
        return fullApplicationIdentityOut;
    }

    /**
     * Sets the value of the fullApplicationIdentityOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullApplicationIdentityOut(String value) {
        this.fullApplicationIdentityOut = value;
    }

}
