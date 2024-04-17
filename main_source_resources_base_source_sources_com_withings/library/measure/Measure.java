package com.withings.library.measure;

import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.library.measure.ws.MeasureGroupResponse;
import com.withings.network.android.interceptors.AppQueryParamInterceptor;
import com.withings.vasistas.ws.WsVasistasSerie;
import java.io.Serializable;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
import rw.a;
@Deprecated
/* loaded from: classes4.dex */
public class Measure extends a implements Serializable {
    private static final long serialVersionUID = -6115272012030001713L;
    private String algoParams;
    private Integer algoVersion;
    private Integer appVersion;
    private Date date;
    private MeasuresGroup group;

    /* renamed from: id  reason: collision with root package name */
    private long f40634id;
    private Integer limbPosition;
    private Integer platform;
    private int type;
    private int unit;
    private double value;

    public Measure(double d11, double d12) {
        super(d11, d12);
        this.f40634id = -1L;
    }

    public static Measure from(JSONObject jSONObject) throws JSONException {
        Measure measure = new Measure();
        measure.f95793x = jSONObject.getDouble("x");
        measure.unit = jSONObject.getInt(HealthConstants.FoodIntake.UNIT);
        measure.setValue(jSONObject.getDouble("value"));
        measure.f40634id = jSONObject.getLong("id");
        measure.type = jSONObject.getInt("type");
        measure.date = new Date(jSONObject.getLong("date"));
        if (jSONObject.has(WsVasistasSerie.KEY_ALGO)) {
            measure.algoVersion = Integer.valueOf(jSONObject.getInt(WsVasistasSerie.KEY_ALGO));
        }
        if (jSONObject.has(AppQueryParamInterceptor.KEY_APP_VERSION)) {
            measure.appVersion = Integer.valueOf(jSONObject.getInt(AppQueryParamInterceptor.KEY_APP_VERSION));
        }
        if (jSONObject.has("apppfmid")) {
            measure.platform = Integer.valueOf(jSONObject.getInt("apppfmid"));
        }
        if (jSONObject.has("position")) {
            measure.limbPosition = Integer.valueOf(jSONObject.getInt("position"));
        }
        if (jSONObject.has("algo_params")) {
            measure.setAlgoParams(jSONObject.getJSONObject("algo_params").toString());
        }
        return measure;
    }

    public String getAlgoParams() {
        return this.algoParams;
    }

    public Integer getAlgoVersion() {
        return this.algoVersion;
    }

    public Integer getAppVersion() {
        return this.appVersion;
    }

    @Deprecated
    public Date getDate() {
        return this.date;
    }

    public MeasuresGroup getGroup() {
        return this.group;
    }

    public long getId() {
        return this.f40634id;
    }

    public Integer getLimbPosition() {
        return this.limbPosition;
    }

    public Integer getPlatform() {
        return this.platform;
    }

    public int getType() {
        return this.type;
    }

    public int getUnit() {
        return this.unit;
    }

    public double getValue() {
        return this.value;
    }

    public void setAlgoParams(String str) {
        this.algoParams = str;
    }

    public void setAlgoVersion(Integer num) {
        this.algoVersion = num;
    }

    public void setAppVersion(Integer num) {
        this.appVersion = num;
    }

    public void setDate(Date date) {
        this.date = date;
        if (date != null) {
            this.f95793x = date.getTime();
        }
    }

    public void setGroup(MeasuresGroup measuresGroup) {
        this.group = measuresGroup;
    }

    public void setId(long j5) {
        this.f40634id = j5;
    }

    public void setLimbPosition(Integer num) {
        this.limbPosition = num;
    }

    public void setPlatform(Integer num) {
        this.platform = num;
    }

    public void setType(int i11) {
        this.type = i11;
    }

    public void setUnit(int i11) {
        this.unit = i11;
    }

    public void setValue(double d11) {
        this.value = d11;
        this.f95794y = d11;
        for (int i11 = this.unit; i11 < 0; i11++) {
            this.f95794y /= 10.0d;
        }
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", this.f95793x);
        jSONObject.put("value", this.value);
        jSONObject.put("id", this.f40634id);
        jSONObject.put("type", this.type);
        jSONObject.put(HealthConstants.FoodIntake.UNIT, this.unit);
        jSONObject.put("date", this.date.getTime());
        Integer num = this.algoVersion;
        if (num != null) {
            jSONObject.put(WsVasistasSerie.KEY_ALGO, num);
        }
        Integer num2 = this.appVersion;
        if (num2 != null) {
            jSONObject.put(AppQueryParamInterceptor.KEY_APP_VERSION, num2);
        }
        Integer num3 = this.platform;
        if (num3 != null) {
            jSONObject.put("apppfmid", num3);
        }
        Integer num4 = this.limbPosition;
        if (num4 != null) {
            jSONObject.put("position", num4);
        }
        if (this.algoParams != null) {
            jSONObject.put("algo_params", new JSONObject(this.algoParams));
        }
        return jSONObject;
    }

    public Measure() {
        this(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
    }

    public Measure(MeasureGroupResponse.WsMeasure wsMeasure) {
        this();
        this.unit = wsMeasure.unit;
        this.type = wsMeasure.type;
        setValue(wsMeasure.value);
        this.algoVersion = wsMeasure.algoVersion;
        this.appVersion = wsMeasure.appVersion;
        this.platform = wsMeasure.platform;
        this.limbPosition = wsMeasure.limbPosition;
        this.algoParams = wsMeasure.algoParams;
    }
}
