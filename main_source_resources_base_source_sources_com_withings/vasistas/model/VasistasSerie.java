package com.withings.vasistas.model;

import androidx.appcompat.app.h;
import com.withings.vasistas.model.Vasistas;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: VasistasSerie.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003Jh\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016¨\u0006."}, d2 = {"Lcom/withings/vasistas/model/VasistasSerie;", "", "deviceModel", "", "deviceId", "category", "Lcom/withings/vasistas/model/Vasistas$Category;", "vasistasType", "Lcom/withings/vasistas/model/Vasistas$VasistasType;", "version", "algoVersion", "firmware", "vasistasList", "", "Lcom/withings/vasistas/model/Vasistas;", "(IILcom/withings/vasistas/model/Vasistas$Category;Lcom/withings/vasistas/model/Vasistas$VasistasType;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getAlgoVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCategory", "()Lcom/withings/vasistas/model/Vasistas$Category;", "getDeviceId", "()I", "getDeviceModel", "getFirmware", "getVasistasList", "()Ljava/util/List;", "getVasistasType", "()Lcom/withings/vasistas/model/Vasistas$VasistasType;", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(IILcom/withings/vasistas/model/Vasistas$Category;Lcom/withings/vasistas/model/Vasistas$VasistasType;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/withings/vasistas/model/VasistasSerie;", "equals", "", "other", "hashCode", "toString", "", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VasistasSerie {
    private final Integer algoVersion;
    private final Vasistas.Category category;
    private final int deviceId;
    private final int deviceModel;
    private final Integer firmware;
    private final List<Vasistas> vasistasList;
    private final Vasistas.VasistasType vasistasType;
    private final int version;

    public VasistasSerie(int i11, int i12, Vasistas.Category category, Vasistas.VasistasType vasistasType, int i13, Integer num, Integer num2, List<Vasistas> vasistasList) {
        u.j(category, "category");
        u.j(vasistasType, "vasistasType");
        u.j(vasistasList, "vasistasList");
        this.deviceModel = i11;
        this.deviceId = i12;
        this.category = category;
        this.vasistasType = vasistasType;
        this.version = i13;
        this.algoVersion = num;
        this.firmware = num2;
        this.vasistasList = vasistasList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VasistasSerie copy$default(VasistasSerie vasistasSerie, int i11, int i12, Vasistas.Category category, Vasistas.VasistasType vasistasType, int i13, Integer num, Integer num2, List list, int i14, Object obj) {
        int i15;
        int i16;
        Vasistas.Category category2;
        Vasistas.VasistasType vasistasType2;
        int i17;
        Integer num3;
        Integer num4;
        List<Vasistas> list2;
        if ((i14 & 1) != 0) {
            i15 = vasistasSerie.deviceModel;
        } else {
            i15 = i11;
        }
        if ((i14 & 2) != 0) {
            i16 = vasistasSerie.deviceId;
        } else {
            i16 = i12;
        }
        if ((i14 & 4) != 0) {
            category2 = vasistasSerie.category;
        } else {
            category2 = category;
        }
        if ((i14 & 8) != 0) {
            vasistasType2 = vasistasSerie.vasistasType;
        } else {
            vasistasType2 = vasistasType;
        }
        if ((i14 & 16) != 0) {
            i17 = vasistasSerie.version;
        } else {
            i17 = i13;
        }
        if ((i14 & 32) != 0) {
            num3 = vasistasSerie.algoVersion;
        } else {
            num3 = num;
        }
        if ((i14 & 64) != 0) {
            num4 = vasistasSerie.firmware;
        } else {
            num4 = num2;
        }
        if ((i14 & 128) != 0) {
            list2 = vasistasSerie.vasistasList;
        } else {
            list2 = list;
        }
        return vasistasSerie.copy(i15, i16, category2, vasistasType2, i17, num3, num4, list2);
    }

    public final int component1() {
        return this.deviceModel;
    }

    public final int component2() {
        return this.deviceId;
    }

    public final Vasistas.Category component3() {
        return this.category;
    }

    public final Vasistas.VasistasType component4() {
        return this.vasistasType;
    }

    public final int component5() {
        return this.version;
    }

    public final Integer component6() {
        return this.algoVersion;
    }

    public final Integer component7() {
        return this.firmware;
    }

    public final List<Vasistas> component8() {
        return this.vasistasList;
    }

    public final VasistasSerie copy(int i11, int i12, Vasistas.Category category, Vasistas.VasistasType vasistasType, int i13, Integer num, Integer num2, List<Vasistas> vasistasList) {
        u.j(category, "category");
        u.j(vasistasType, "vasistasType");
        u.j(vasistasList, "vasistasList");
        return new VasistasSerie(i11, i12, category, vasistasType, i13, num, num2, vasistasList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VasistasSerie)) {
            return false;
        }
        VasistasSerie vasistasSerie = (VasistasSerie) obj;
        if (this.deviceModel == vasistasSerie.deviceModel && this.deviceId == vasistasSerie.deviceId && this.category == vasistasSerie.category && this.vasistasType == vasistasSerie.vasistasType && this.version == vasistasSerie.version && u.e(this.algoVersion, vasistasSerie.algoVersion) && u.e(this.firmware, vasistasSerie.firmware) && u.e(this.vasistasList, vasistasSerie.vasistasList)) {
            return true;
        }
        return false;
    }

    public final Integer getAlgoVersion() {
        return this.algoVersion;
    }

    public final Vasistas.Category getCategory() {
        return this.category;
    }

    public final int getDeviceId() {
        return this.deviceId;
    }

    public final int getDeviceModel() {
        return this.deviceModel;
    }

    public final Integer getFirmware() {
        return this.firmware;
    }

    public final List<Vasistas> getVasistasList() {
        return this.vasistasList;
    }

    public final Vasistas.VasistasType getVasistasType() {
        return this.vasistasType;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode;
        int a11 = h.a(this.deviceId, Integer.hashCode(this.deviceModel) * 31, 31);
        int a12 = h.a(this.version, (this.vasistasType.hashCode() + ((this.category.hashCode() + a11) * 31)) * 31, 31);
        Integer num = this.algoVersion;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (a12 + hashCode) * 31;
        Integer num2 = this.firmware;
        if (num2 != null) {
            i11 = num2.hashCode();
        }
        return this.vasistasList.hashCode() + ((i12 + i11) * 31);
    }

    public String toString() {
        int i11 = this.deviceModel;
        int i12 = this.deviceId;
        Vasistas.Category category = this.category;
        Vasistas.VasistasType vasistasType = this.vasistasType;
        int i13 = this.version;
        Integer num = this.algoVersion;
        Integer num2 = this.firmware;
        List<Vasistas> list = this.vasistasList;
        StringBuilder e11 = h.e("VasistasSerie(deviceModel=", i11, ", deviceId=", i12, ", category=");
        e11.append(category);
        e11.append(", vasistasType=");
        e11.append(vasistasType);
        e11.append(", version=");
        e11.append(i13);
        e11.append(", algoVersion=");
        e11.append(num);
        e11.append(", firmware=");
        e11.append(num2);
        e11.append(", vasistasList=");
        e11.append(list);
        e11.append(")");
        return e11.toString();
    }

    public /* synthetic */ VasistasSerie(int i11, int i12, Vasistas.Category category, Vasistas.VasistasType vasistasType, int i13, Integer num, Integer num2, List list, int i14, m mVar) {
        this(i11, i12, category, vasistasType, i13, (i14 & 32) != 0 ? null : num, (i14 & 64) != 0 ? null : num2, list);
    }
}
