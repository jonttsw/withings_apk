package com.withings.healthplus.contentscreens.ui.model;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.l0;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: RecommendedEquipmentUi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/RecommendedEquipmentUi;", "", "iconId", "", Constants.ScionAnalytics.PARAM_LABEL, "required", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getIconId", "()Ljava/lang/String;", "getLabel", "getRequired", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecommendedEquipmentUi {
    public static final int $stable = 0;
    private final String iconId;
    private final String label;
    private final boolean required;

    public RecommendedEquipmentUi(String iconId, String label, boolean z5) {
        u.j(iconId, "iconId");
        u.j(label, "label");
        this.iconId = iconId;
        this.label = label;
        this.required = z5;
    }

    public static /* synthetic */ RecommendedEquipmentUi copy$default(RecommendedEquipmentUi recommendedEquipmentUi, String str, String str2, boolean z5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = recommendedEquipmentUi.iconId;
        }
        if ((i11 & 2) != 0) {
            str2 = recommendedEquipmentUi.label;
        }
        if ((i11 & 4) != 0) {
            z5 = recommendedEquipmentUi.required;
        }
        return recommendedEquipmentUi.copy(str, str2, z5);
    }

    public final String component1() {
        return this.iconId;
    }

    public final String component2() {
        return this.label;
    }

    public final boolean component3() {
        return this.required;
    }

    public final RecommendedEquipmentUi copy(String iconId, String label, boolean z5) {
        u.j(iconId, "iconId");
        u.j(label, "label");
        return new RecommendedEquipmentUi(iconId, label, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendedEquipmentUi)) {
            return false;
        }
        RecommendedEquipmentUi recommendedEquipmentUi = (RecommendedEquipmentUi) obj;
        if (u.e(this.iconId, recommendedEquipmentUi.iconId) && u.e(this.label, recommendedEquipmentUi.label) && this.required == recommendedEquipmentUi.required) {
            return true;
        }
        return false;
    }

    public final String getIconId() {
        return this.iconId;
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public int hashCode() {
        return Boolean.hashCode(this.required) + d.c(this.label, this.iconId.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.iconId;
        String str2 = this.label;
        return h.d(l0.b("RecommendedEquipmentUi(iconId=", str, ", label=", str2, ", required="), this.required, ")");
    }
}
