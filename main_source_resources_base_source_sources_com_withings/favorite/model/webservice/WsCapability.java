package com.withings.favorite.model.webservice;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: WsCapability.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#B1\b\u0011\u0012\u0006\u0010$\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u000e\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\rR \u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u0010¨\u0006*"}, d2 = {"Lcom/withings/favorite/model/webservice/WsCapability;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/favorite/model/webservice/WsCapability;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "", "component2", "()I", "id", "version", "copy", "(Ljava/lang/String;I)Lcom/withings/favorite/model/webservice/WsCapability;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "I", "getVersion", "getVersion$annotations", "<init>", "(Ljava/lang/String;I)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class WsCapability {
    public static final Companion Companion = new Companion(null);

    /* renamed from: id  reason: collision with root package name */
    private final String f39107id;
    private final int version;

    /* compiled from: WsCapability.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/favorite/model/webservice/WsCapability$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/favorite/model/webservice/WsCapability;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsCapability> serializer() {
            return WsCapability$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsCapability(int i11, String str, int i12, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i11 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 3, WsCapability$$serializer.INSTANCE.getDescriptor());
        }
        this.f39107id = str;
        this.version = i12;
    }

    public static /* synthetic */ WsCapability copy$default(WsCapability wsCapability, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = wsCapability.f39107id;
        }
        if ((i12 & 2) != 0) {
            i11 = wsCapability.version;
        }
        return wsCapability.copy(str, i11);
    }

    public static final /* synthetic */ void write$Self$android_release(WsCapability wsCapability, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wsCapability.f39107id);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, wsCapability.version);
    }

    public final String component1() {
        return this.f39107id;
    }

    public final int component2() {
        return this.version;
    }

    public final WsCapability copy(String id2, int i11) {
        u.j(id2, "id");
        return new WsCapability(id2, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsCapability)) {
            return false;
        }
        WsCapability wsCapability = (WsCapability) obj;
        if (u.e(this.f39107id, wsCapability.f39107id) && this.version == wsCapability.version) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.f39107id;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Integer.hashCode(this.version) + (this.f39107id.hashCode() * 31);
    }

    public String toString() {
        String str = this.f39107id;
        int i11 = this.version;
        return "WsCapability(id=" + str + ", version=" + i11 + ")";
    }

    public WsCapability(String id2, int i11) {
        u.j(id2, "id");
        this.f39107id = id2;
        this.version = i11;
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }
}
