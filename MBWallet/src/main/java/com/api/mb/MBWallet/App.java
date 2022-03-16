package com.api.mb.MBWallet;

import ratpack.server.RatpackServer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
      RatpackServer.start(server -> server.handlers(chain -> chain
      .get(ctx -> ctx.render("Welcome to API via ratpack!!!"))));
    }
}
