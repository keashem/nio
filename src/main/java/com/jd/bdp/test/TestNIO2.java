package com.jd.bdp.test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

public class TestNIO2 {
    public static void main(String[] args) throws IOException {

        Selector selector = Selector.open();

        ServerSocketChannel socketChannel = ServerSocketChannel.open();

        socketChannel.configureBlocking(false);

        socketChannel.bind(new InetSocketAddress(8088));

        socketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true){

            selector.select();
            System.out.println("hhhhh");

        }

    }
}
