package com.withings.contentproviders.eightfit.model.webservice;

import com.google.gson.annotations.SerializedName;
import com.withings.vasistas.ws.WsVasistasSerie;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: WsRecommendedDevice.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001d\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#B3\b\u0011\u0012\u0006\u0010$\u001a\u00020\f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\u0011¨\u0006*"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsRecommendedDevice;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/webservice/WsRecommendedDevice;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "", "component1", "()Ljava/util/List;", "", "component2", "()Z", "models", "required", "copy", "(Ljava/util/List;Z)Lcom/withings/contentproviders/eightfit/model/webservice/WsRecommendedDevice;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getModels", "Z", "getRequired", "<init>", "(Ljava/util/List;Z)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class WsRecommendedDevice {
    @SerializedName(WsVasistasSerie.KEY_MODEL)
    private final List<Integer> models;
    @SerializedName("required")
    private final boolean required;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IntSerializer.INSTANCE), null};

    /* compiled from: WsRecommendedDevice.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsRecommendedDevice$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsRecommendedDevice;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsRecommendedDevice> serializer() {
            return WsRecommendedDevice$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsRecommendedDevice(int i11, List list, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i11 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 3, WsRecommendedDevice$$serializer.INSTANCE.getDescriptor());
        }
        this.models = list;
        this.required = z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsRecommendedDevice copy$default(WsRecommendedDevice wsRecommendedDevice, List list, boolean z5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = wsRecommendedDevice.models;
        }
        if ((i11 & 2) != 0) {
            z5 = wsRecommendedDevice.required;
        }
        return wsRecommendedDevice.copy(list, z5);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(WsRecommendedDevice wsRecommendedDevice, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], wsRecommendedDevice.models);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, wsRecommendedDevice.required);
    }

    public final List<Integer> component1() {
        return this.models;
    }

    public final boolean component2() {
        return this.required;
    }

    public final WsRecommendedDevice copy(List<Integer> models, boolean z5) {
        u.j(models, "models");
        return new WsRecommendedDevice(models, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsRecommendedDevice)) {
            return false;
        }
        WsRecommendedDevice wsRecommendedDevice = (WsRecommendedDevice) obj;
        if (u.e(this.models, wsRecommendedDevice.models) && this.required == wsRecommendedDevice.required) {
            return true;
        }
        return false;
    }

    public final List<Integer> getModels() {
        return this.models;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public int hashCode() {
        return Boolean.hashCode(this.required) + (this.models.hashCode() * 31);
    }

    public String toString() {
        List<Integer> list = this.models;
        boolean z5 = this.required;
        return "WsRecommendedDevice(models=" + list + ", required=" + z5 + ")";
    }

    public WsRecommendedDevice(List<Integer> models, boolean z5) {
        u.j(models, "models");
        this.models = models;
        this.required = z5;
    }
}
