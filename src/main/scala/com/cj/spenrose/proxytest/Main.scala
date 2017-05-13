package com.cj.spenrose.proxytest

import org.httpobjects.jetty.HttpObjectsJettyHandler
import org.httpobjects.proxy.Proxy

object Main extends App {
  
  HttpObjectsJettyHandler.launchServer(8080, new Proxy(
    "", //localPath, 
    "https://apple.com/", //base, 
    "localhost:8080" //me    
  ))
}