package com.withings.vasistas.ws;

import java.util.List;
import org.joda.time.DateTime;
/* loaded from: classes4.dex */
public class WsVasistasSerie {
    public static final String KEY_ALGO = "algo";
    public static final String KEY_DATES = "dates";
    public static final String KEY_FORMAT = "format";
    public static final String KEY_FW = "fw";
    public static final String KEY_MODEL = "model";
    public static final String KEY_TYPES = "types";
    public static final String KEY_VASISTAS = "vasistas";
    public static final String KEY_VERSION = "version";
    public List<DateTime> dates;
    public List<Integer> types;
    public List<List<Double>> vasistas;
    public int version;
    public int model = 51;
    public Integer algo = null;

    /* renamed from: fw  reason: collision with root package name */
    public Integer f46399fw = null;
    public Integer apppfmid = null;
    public Integer appliver = null;

    /* loaded from: classes4.dex */
    public static class Response {
        public List<WsVasistasSerie> series;
    }
}
