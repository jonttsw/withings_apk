package com.withings.location.model;

import androidx.compose.material3.d;
import com.google.gson.annotations.SerializedName;
import com.withings.contentproviders.eightfit.model.webservice.a;
import com.withings.vasistas.ws.WsVasistasSerie;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: VasistasSeries.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J]\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00072\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006#"}, d2 = {"Lcom/withings/location/model/VasistasSeries;", "", "deviceModel", "", WsVasistasSerie.KEY_FORMAT, "", WsVasistasSerie.KEY_DATES, "", "Lorg/joda/time/DateTime;", WsVasistasSerie.KEY_TYPES, WsVasistasSerie.KEY_VASISTAS, "", "version", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)V", "getDates", "()Ljava/util/List;", "getDeviceModel", "()I", "getFormat", "()Ljava/lang/String;", "getTypes", "getVasistas", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VasistasSeries {
    private final List<DateTime> dates;
    @SerializedName(WsVasistasSerie.KEY_MODEL)
    private final int deviceModel;
    private final String format;
    private final List<Integer> types;
    private final List<List<Double>> vasistas;
    private final int version;

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

    public static /* synthetic */ VasistasSeries copy$default(VasistasSeries vasistasSeries, int i11, String str, List list, List list2, List list3, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = vasistasSeries.deviceModel;
        }
        if ((i13 & 2) != 0) {
            str = vasistasSeries.format;
        }
        String str2 = str;
        List<DateTime> list4 = list;
        if ((i13 & 4) != 0) {
            list4 = vasistasSeries.dates;
        }
        List list5 = list4;
        List<Integer> list6 = list2;
        if ((i13 & 8) != 0) {
            list6 = vasistasSeries.types;
        }
        List list7 = list6;
        List<List<Double>> list8 = list3;
        if ((i13 & 16) != 0) {
            list8 = vasistasSeries.vasistas;
        }
        List list9 = list8;
        if ((i13 & 32) != 0) {
            i12 = vasistasSeries.version;
        }
        return vasistasSeries.copy(i11, str2, list5, list7, list9, i12);
    }

    public final int component1() {
        return this.deviceModel;
    }

    public final String component2() {
        return this.format;
    }

    public final List<DateTime> component3() {
        return this.dates;
    }

    public final List<Integer> component4() {
        return this.types;
    }

    public final List<List<Double>> component5() {
        return this.vasistas;
    }

    public final int component6() {
        return this.version;
    }

    public final VasistasSeries copy(int i11, String format, List<DateTime> dates, List<Integer> types, List<? extends List<Double>> vasistas, int i12) {
        u.j(format, "format");
        u.j(dates, "dates");
        u.j(types, "types");
        u.j(vasistas, "vasistas");
        return new VasistasSeries(i11, format, dates, types, vasistas, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VasistasSeries)) {
            return false;
        }
        VasistasSeries vasistasSeries = (VasistasSeries) obj;
        if (this.deviceModel == vasistasSeries.deviceModel && u.e(this.format, vasistasSeries.format) && u.e(this.dates, vasistasSeries.dates) && u.e(this.types, vasistasSeries.types) && u.e(this.vasistas, vasistasSeries.vasistas) && this.version == vasistasSeries.version) {
            return true;
        }
        return false;
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

    public int hashCode() {
        return Integer.hashCode(this.version) + e.b(this.vasistas, e.b(this.types, e.b(this.dates, d.c(this.format, Integer.hashCode(this.deviceModel) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        int i11 = this.deviceModel;
        String str = this.format;
        List<DateTime> list = this.dates;
        List<Integer> list2 = this.types;
        List<List<Double>> list3 = this.vasistas;
        int i12 = this.version;
        StringBuilder a11 = d.a("VasistasSeries(deviceModel=", i11, ", format=", str, ", dates=");
        a.a(a11, list, ", types=", list2, ", vasistas=");
        a11.append(list3);
        a11.append(", version=");
        a11.append(i12);
        a11.append(")");
        return a11.toString();
    }

    public /* synthetic */ VasistasSeries(int i11, String str, List list, List list2, List list3, int i12, int i13, m mVar) {
        this(i11, str, list, list2, list3, (i13 & 32) != 0 ? 0 : i12);
    }
}
