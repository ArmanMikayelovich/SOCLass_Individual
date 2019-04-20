/*
 * WbModule.java
 *
 * Created on Apr 21, 2019 1:15:16 AM
 */

package com.webbfontaine.twm.wbetst.module;

import so.kernel.core.modules.ModuleInstall;
import so.kernel.server.DocumentModulesManager;

/**
 *
 */
public class WbModule extends ModuleInstall {
    
    /** Creates a new instance of WbModule */
    public WbModule() {
    }
    
    /** Called when an already-installed module is restored (at System startup
     * time). Should perform whatever initializations are required. The module
     * can load resource about the module. The class loader is a module class
     * loader.
     *
     */
    public void restored() {
        DocumentModulesManager.registerModule(new WbDocumentInfo());
    }
    
}
