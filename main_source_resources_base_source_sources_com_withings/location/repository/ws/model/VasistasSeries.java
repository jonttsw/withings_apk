package com.withings.location.repository.ws.model;

import com.google.gson.annotations.SerializedName;
import com.withings.vasistas.ws.WsVasistasSerie;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: VasistasSeries.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0017BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/withings/location/repository/ws/model/VasistasSeries;", "", "deviceModel", "", WsVasistasSerie.KEY_FORMAT, "", WsVasistasSerie.KEY_DATES, "", "Lorg/joda/time/DateTime;", WsVasistasSerie.KEY_TYPES, WsVasistasSerie.KEY_VASISTAS, "", "version", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)V", "getDates", "()Ljava/util/List;", "getDeviceModel", "()I", "getFormat", "()Ljava/lang/String;", "getTypes", "getVasistas", "getVersion", "Response", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VasistasSeries {
    private final List<DateTime> dates;
    @SerializedName(WsVasistasSerie.KEY_MODEL)
    private final int deviceModel;
    private final String format;
    private final List<Integer> types;
    private final List<List<Double>> vasistas;
    private final int version;

    /* compiled from: VasistasSeries.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/location/repository/ws/model/VasistasSeries$Response;", "", "()V", "series", "", "Lcom/withings/location/repository/ws/model/VasistasSeries;", "getSeries", "()Ljava/util/List;", "setSeries", "(Ljava/util/List;)V", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Response {
        private List<VasistasSeries> series;

        public final List<VasistasSeries> getSeries() {
            return this.series;
        }

        public final void setSeries(List<VasistasSeries> list) {
            this.series = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VasistasSeries(int i11, String format, List<DateTime> dates, List<Integer> types, List<? extends List<Double>> vasistas, int i12) {
        u.j(format, "format");
        u.j(dates, "dates");
        u.j(types, "types");
        u.j(vasistas, "vasistas");
        this.deviceModel = i11;
        this.format = format;
        this.dates = dates;
        this.types = types;
        this.vasistas = vasistas;
        this.version = i12;
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

    public final int getVersion() {
        return this.version;
    }

    public /* synthetic */ VasistasSeries(int i11, String str, List list, List list2, List list3, int i12, int i13, m mVar) {
        this(i11, str, list, list2, list3, (i13 & 32) != 0 ? 0 : i12);
    }
}
