/*
 * WbDocumentInfo.java
 *
 * Created on Apr 21, 2019 1:15:16 AM
 */

package com.webbfontaine.twm.wbetst.module;


import so.kernel.server.DocumentModuleInfo;
import so.kernel.server.Server;



/**
 *
 */
public class WbDocumentInfo extends DocumentModuleInfo {
    
    /** Creates a new instance of WbDocumentInfo */
    public WbDocumentInfo() {
        super();
    }
    
    protected void init() {
        String url = Server.getString("module.com.webbfontaine.twm.wbtest.gcf.url");
        String usr = Server.getString("module.com.webbfontaine.twm.wbtest.gcf.user");
        String passwd = Server.getString("module.com.webbfontaine.twm.wbtest.gcf.password");
        
        String iedTable = Server.getString("module.com.webbfontaine.twm.wbtest.gcf.tables.ied");
        String historyTable = Server.getString("module.com.webbfontaine.twm.wbtest.gcf.tables.history");
        String locksTable = Server.getString("module.com.webbfontaine.twm.wbtest.gcf.tables.locks");
        String trackTable = Server.getString("module.com.webbfontaine.twm.wbtest.gcf.tables.track");
        
        setIED(url, usr, passwd, iedTable);
        setHistory(url, usr, passwd, historyTable);
        setLocks(url, usr, passwd, locksTable);
        setTrack(url, usr, passwd, trackTable);
        
        
    }
    
}
