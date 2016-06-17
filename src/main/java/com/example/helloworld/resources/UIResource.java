package com.example.helloworld.resources;

import com.example.helloworld.views.UIView;
import io.dropwizard.hibernate.UnitOfWork;
import io.dropwizard.jersey.params.LongParam;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.util.ArrayList;

@Path("/ui")
public class UIResource {


    public UIResource() {
    }

    @GET
    @UnitOfWork
    @Produces(MediaType.TEXT_HTML)
    public UIView getUIViewMustache() {
        return new UIView(UIView.Template.JS);
    }

    @POST
    @UnitOfWork
    public void setAtomCon(String str) {

	System.out.println("-------------------------------------------------------");
	System.out.println(str);
	System.out.println(new Gson().fromJson(str, AtomConfig.class));
	System.out.println("-------------------------------------------------------");
    }

    public static class AtomConfig {

		private String agentsParam;
		private List<String> agents = new ArrayList<>();
		private String orderBooksParam;
		private List<String> orderBooks = new ArrayList<>();

		private int orderBooksRandom;
		private int agentsRandom;

		private int dayGap;
		private int tickOpening;
		private int tickContinuous;
		private int tickClosing;
		private int days;

		private boolean marketMarker;
		private int marketMakerQuantity;

		// HBase - MultiThreading - buff options
		private int worker;
		private int flushRatio;
		private int bufferSize;
		private int stackPuts;
		private boolean autoFlush;
		private byte[] cfName;
		private String tableName;
	    private String sparkTableName ;

		// App data
		private long startTime;
		private boolean outHbase;
		private boolean outSystem;
		private String outFilePath;
		// private boolean replay;
		// private String replaySource;
		private boolean outFile;
	    private boolean outKafka;
		private boolean outAvro;
		private String avroSchema;
		private String avroHDFSDest;
	    private String parquetHDFSDest;
		private String pathAvro;

		private String hadoopConfCore;
		private String hbaseConfHbase;
		private String hadoopConfHdfs;
	    private String kafkaTopic ;
	    private String kafkaBoot ;
	    private String kafkaQuorum ;
		
		private int agentCash;
		private int agentMinPrice;
		private int agentMaxPrice;
		private int agentMinQuantity;
		private int agentMaxQuantity;
		
		// TimeStampBuilder
		private String tsbDateBegin;
		private String tsbOpenHour;
		private String tsbCloseHour;
		private int tsbNbTickMax;
		private int nbAgents;
	    private int nbOrderBooks;

    }

}
