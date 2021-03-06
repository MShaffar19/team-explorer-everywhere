// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.wss;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.wss._ListsSoap_AddListFromFeature;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ListsSoap_AddListFromFeature
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String listName;
    protected String description;
    protected String featureID;
    protected int templateID;

    public _ListsSoap_AddListFromFeature()
    {
        super();
    }

    public _ListsSoap_AddListFromFeature(
        final String listName,
        final String description,
        final String featureID,
        final int templateID)
    {
        // TODO : Call super() instead of setting all fields directly?
        setListName(listName);
        setDescription(description);
        setFeatureID(featureID);
        setTemplateID(templateID);
    }

    public String getListName()
    {
        return this.listName;
    }

    public void setListName(String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'listName' is a required element, its value cannot be null");
        }

        this.listName = value;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String value)
    {
        this.description = value;
    }

    public String getFeatureID()
    {
        return this.featureID;
    }

    public void setFeatureID(String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'featureID' is a required element, its value cannot be null");
        }

        this.featureID = value;
    }

    public int getTemplateID()
    {
        return this.templateID;
    }

    public void setTemplateID(int value)
    {
        this.templateID = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "listName",
            this.listName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "description",
            this.description);
        XMLStreamWriterHelper.writeElement(
            writer,
            "featureID",
            this.featureID);
        XMLStreamWriterHelper.writeElement(
            writer,
            "templateID",
            this.templateID);

        writer.writeEndElement();
    }
}
