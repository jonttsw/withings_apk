package com.withings.webservices.legacy.withings.model;

import java.util.List;
import org.joda.time.DateTime;
/* loaded from: classes4.dex */
public class WsVasistasSerie {
    public List<DateTime> dates;
    public int model = 51;
    public List<Integer> types;
    public List<List<Double>> vasistas;

    /* loaded from: classes4.dex */
    public static class Response {
        public List<WsVasistasSerie> series;
    }
}
