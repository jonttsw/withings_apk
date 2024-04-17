package com.withings.vasistas.ws;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import org.joda.time.DateTime;
/* compiled from: VasistasSerieV2.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0007¢\u0006\u0002\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/withings/vasistas/ws/VasistasSerieV2;", "", "deviceModel", "", WsVasistasSerie.KEY_FORMAT, "", WsVasistasSerie.KEY_DATES, "", "Lorg/joda/time/DateTime;", WsVasistasSerie.KEY_TYPES, WsVasistasSerie.KEY_VASISTAS, "", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDates", "()Ljava/util/List;", "getDeviceModel", "()I", "getFormat", "()Ljava/lang/String;", "getTypes", "getVasistas", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VasistasSerieV2 {
    private final List<DateTime> dates;
    @SerializedName(WsVasistasSerie.KEY_MODEL)
    private final int deviceModel;
    private final String format;
    private final List<Integer> types;
    private final List<List<Double>> vasistas;

    /* JADX WARN: Multi-variable type inference failed */
    public VasistasSerieV2(int i11, String format, List<DateTime> dates, List<Integer> types, List<? extends List<Double>> vasistas) {
        kotlin.jvm.internal.u.j(format, "format");
        kotlin.jvm.internal.u.j(dates, "dates");
        kotlin.jvm.internal.u.j(types, "types");
        kotlin.jvm.internal.u.j(vasistas, "vasistas");
        this.deviceModel = i11;
        this.format = format;
        this.dates = dates;
        this.types = types;
        this.vasistas = vasistas;
    }

    public final List<DateTime> getDates() {
        return this.dates;
    }

    public final int getDeviceModel() {
        return this.deviceModel;
    }

    public final String getFormat() {
        return this.format;
    }

    public final List<Integer> getTypes() {
        return this.types;
    }

    public final List<List<Double>> getVasistas() {
        return this.vasistas;
    }
}
