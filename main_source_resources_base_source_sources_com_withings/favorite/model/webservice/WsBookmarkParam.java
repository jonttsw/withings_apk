package com.withings.favorite.model.webservice;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
/* compiled from: WsBookmarksParam.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eB'\b\u0011\u0012\u0006\u0010\u001f\u001a\u00020\u0012\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\r¨\u0006%"}, d2 = {"Lcom/withings/favorite/model/webservice/WsBookmarkParam;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/favorite/model/webservice/WsBookmarkParam;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "component1", NavigationArguments.REMOTE_TASK_ID, "copy", "(Ljava/lang/String;)Lcom/withings/favorite/model/webservice/WsBookmarkParam;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRemoteTaskId", "getRemoteTaskId$annotations", "()V", "<init>", "(Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class WsBookmarkParam {
    public static final Companion Companion = new Companion(null);
    private final String remoteTaskId;

    /* compiled from: WsBookmarksParam.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/favorite/model/webservice/WsBookmarkParam$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/favorite/model/webservice/WsBookmarkParam;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsBookmarkParam> serializer() {
            return WsBookmarkParam$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsBookmarkParam(int i11, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i11 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 1, WsBookmarkParam$$serializer.INSTANCE.getDescriptor());
        }
        this.remoteTaskId = str;
    }

    public static /* synthetic */ WsBookmarkParam copy$default(WsBookmarkParam wsBookmarkParam, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsBookmarkParam.remoteTaskId;
        }
        return wsBookmarkParam.copy(str);
    }

    public final String component1() {
        return this.remoteTaskId;
    }

    public final WsBookmarkParam copy(String remoteTaskId) {
        u.j(remoteTaskId, "remoteTaskId");
        return new WsBookmarkParam(remoteTaskId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof WsBookmarkParam) && u.e(this.remoteTaskId, ((WsBookmarkParam) obj).remoteTaskId)) {
            return true;
        }
        return false;
    }

    public final String getRemoteTaskId() {
        return this.remoteTaskId;
    }

    public int hashCode() {
        return this.remoteTaskId.hashCode();
    }

    public String toString() {
        Json.Default r02 = Json.Default;
        r02.getSerializersModule();
        return r02.encodeToString(Companion.serializer(), this);
    }

    public WsBookmarkParam(String remoteTaskId) {
        u.j(remoteTaskId, "remoteTaskId");
        this.remoteTaskId = remoteTaskId;
    }

    public static /* synthetic */ void getRemoteTaskId$annotations() {
    }
}
