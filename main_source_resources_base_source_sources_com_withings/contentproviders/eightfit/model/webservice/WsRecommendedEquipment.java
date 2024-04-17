package com.withings.contentproviders.eightfit.model.webservice;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.l0;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: WsRecommendedEquipment.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b#\u0010$B7\b\u0011\u0012\u0006\u0010%\u001a\u00020\u0018\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b#\u0010(J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b \u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010\u0011¨\u0006+"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsRecommendedEquipment;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/webservice/WsRecommendedEquipment;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "component2", "", "component3", "()Z", Constants.ScionAnalytics.PARAM_LABEL, "iconId", "required", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/withings/contentproviders/eightfit/model/webservice/WsRecommendedEquipment;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getIconId", "Z", "getRequired", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class WsRecommendedEquipment {
    public static final Companion Companion = new Companion(null);
    @SerializedName("icon_id")
    private final String iconId;
    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    private final String label;
    @SerializedName("required")
    private final boolean required;

    /* compiled from: WsRecommendedEquipment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsRecommendedEquipment$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsRecommendedEquipment;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsRecommendedEquipment> serializer() {
            return WsRecommendedEquipment$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsRecommendedEquipment(int i11, String str, String str2, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i11 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 7, WsRecommendedEquipment$$serializer.INSTANCE.getDescriptor());
        }
        this.label = str;
        this.iconId = str2;
        this.required = z5;
    }

    public static /* synthetic */ WsRecommendedEquipment copy$default(WsRecommendedEquipment wsRecommendedEquipment, String str, String str2, boolean z5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsRecommendedEquipment.label;
        }
        if ((i11 & 2) != 0) {
            str2 = wsRecommendedEquipment.iconId;
        }
        if ((i11 & 4) != 0) {
            z5 = wsRecommendedEquipment.required;
        }
        return wsRecommendedEquipment.copy(str, str2, z5);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(WsRecommendedEquipment wsRecommendedEquipment, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wsRecommendedEquipment.label);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, wsRecommendedEquipment.iconId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, wsRecommendedEquipment.required);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.iconId;
    }

    public final boolean component3() {
        return this.required;
    }

    public final WsRecommendedEquipment copy(String label, String iconId, boolean z5) {
        u.j(label, "label");
        u.j(iconId, "iconId");
        return new WsRecommendedEquipment(label, iconId, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsRecommendedEquipment)) {
            return false;
        }
        WsRecommendedEquipment wsRecommendedEquipment = (WsRecommendedEquipment) obj;
        if (u.e(this.label, wsRecommendedEquipment.label) && u.e(this.iconId, wsRecommendedEquipment.iconId) && this.required == wsRecommendedEquipment.required) {
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
        return Boolean.hashCode(this.required) + d.c(this.iconId, this.label.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.label;
        String str2 = this.iconId;
        return h.d(l0.b("WsRecommendedEquipment(label=", str, ", iconId=", str2, ", required="), this.required, ")");
    }

    public WsRecommendedEquipment(String label, String iconId, boolean z5) {
        u.j(label, "label");
        u.j(iconId, "iconId");
        this.label = label;
        this.iconId = iconId;
        this.required = z5;
    }
}
