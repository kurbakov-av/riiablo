package com.riiablo.assets;

import io.netty.buffer.ByteBuf;
import org.junit.BeforeClass;
import org.junit.Test;

import com.badlogic.gdx.Gdx;

import com.riiablo.RiiabloTest;
import com.riiablo.logger.Level;
import com.riiablo.logger.LogManager;
import com.riiablo.mpq_bytebuf.MPQFileHandleResolver;

public class AssetManagerTest extends RiiabloTest {
  @BeforeClass
  public static void before() {
    LogManager.setLevel("com.riiablo.assets", Level.TRACE);
  }

  @Test
  public void init() {
    AssetManager assets = new AssetManager(1);
    MPQFileHandleResolver resolver = new MPQFileHandleResolver(Gdx.files.absolute("C:\\diablo"));
    assets.setReader(ByteBuf.class, new MPQFileHandleReader(resolver));
    assets.dispose();
  }
}