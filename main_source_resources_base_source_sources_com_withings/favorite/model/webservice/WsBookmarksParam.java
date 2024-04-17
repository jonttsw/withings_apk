package com.withings.favorite.model.webservice;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: WsBookmarksParam.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u001e\u0010\u001fB+\b\u0011\u0012\u0006\u0010 \u001a\u00020\u0015\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011¨\u0006&"}, d2 = {"Lcom/withings/favorite/model/webservice/WsBookmarksParam;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/favorite/model/webservice/WsBookmarksParam;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "", "Lcom/withings/favorite/model/webservice/WsBookmarkParam;", "component1", "()Ljava/util/List;", "remoteTaskIds", "copy", "(Ljava/util/List;)Lcom/withings/favorite/model/webservice/WsBookmarksParam;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getRemoteTaskIds", "<init>", "(Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class WsBookmarksParam {
    private final List<WsBookmarkParam> remoteTaskIds;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(WsBookmarkParam$$serializer.INSTANCE)};

    /* compiled from: WsBookmarksParam.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/favorite/model/webservice/WsBookmarksParam$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/favorite/model/webservice/WsBookmarksParam;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsBookmarksParam> serializer() {
            return WsBookmarksParam$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsBookmarksParam(int i11, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i11 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 1, WsBookmarksParam$$serializer.INSTANCE.getDescriptor());
        }
        this.remoteTaskIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsBookmarksParam copy$default(WsBookmarksParam wsBookmarksParam, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = wsBookmarksParam.remoteTaskIds;
        }
        return wsBookmarksParam.copy(list);
    }

    public final List<WsBookmarkParam> component1() {
        return this.remoteTaskIds;
    }

    public final WsBookmarksParam copy(List<WsBookmarkParam> remoteTaskIds) {
        u.j(remoteTaskIds, "remoteTaskIds");
        return new WsBookmarksParam(remoteTaskIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof WsBookmarksParam) && u.e(this.remoteTaskIds, ((WsBookmarksParam) obj).remoteTaskIds)) {
            return true;
        }
        return false;
    }

    public final List<WsBookmarkParam> getRemoteTaskIds() {
        return this.remoteTaskIds;
    }

    public int hashCode() {
        return this.remoteTaskIds.hashCode();
    }

    public String toString() {
        return x.R(this.remoteTaskIds, ",", "[", "]", null, 56);
    }

    public WsBookmarksParam(List<WsBookmarkParam> remoteTaskIds) {
        u.j(remoteTaskIds, "remoteTaskIds");
        this.remoteTaskIds = remoteTaskIds;
    }
}
