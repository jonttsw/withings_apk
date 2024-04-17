package com.withings.favorite.model.webservice;

import defpackage.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: WsBookmarkResponse.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001d\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&B7\b\u0011\u0012\u0006\u0010'\u001a\u00020\u000f\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u000f\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u000eR \u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u0011¨\u0006-"}, d2 = {"Lcom/withings/favorite/model/webservice/WsBookmarkResponse;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/favorite/model/webservice/WsBookmarkResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "Lf;", "component1", "()Ljava/util/List;", "", "component2", "()I", "bookmarks", "modified", "copy", "(Ljava/util/List;I)Lcom/withings/favorite/model/webservice/WsBookmarkResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBookmarks", "getBookmarks$annotations", "()V", "I", "getModified", "getModified$annotations", "<init>", "(Ljava/util/List;I)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class WsBookmarkResponse {
    private final List<f> bookmarks;
    private final int modified;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(f.a.f65901a), null};

    /* compiled from: WsBookmarkResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/favorite/model/webservice/WsBookmarkResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/favorite/model/webservice/WsBookmarkResponse;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsBookmarkResponse> serializer() {
            return WsBookmarkResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsBookmarkResponse(int i11, List list, int i12, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i11 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 3, WsBookmarkResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.bookmarks = list;
        this.modified = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsBookmarkResponse copy$default(WsBookmarkResponse wsBookmarkResponse, List list, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = wsBookmarkResponse.bookmarks;
        }
        if ((i12 & 2) != 0) {
            i11 = wsBookmarkResponse.modified;
        }
        return wsBookmarkResponse.copy(list, i11);
    }

    public static final /* synthetic */ void write$Self$android_release(WsBookmarkResponse wsBookmarkResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], wsBookmarkResponse.bookmarks);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, wsBookmarkResponse.modified);
    }

    public final List<f> component1() {
        return this.bookmarks;
    }

    public final int component2() {
        return this.modified;
    }

    public final WsBookmarkResponse copy(List<f> bookmarks, int i11) {
        u.j(bookmarks, "bookmarks");
        return new WsBookmarkResponse(bookmarks, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsBookmarkResponse)) {
            return false;
        }
        WsBookmarkResponse wsBookmarkResponse = (WsBookmarkResponse) obj;
        if (u.e(this.bookmarks, wsBookmarkResponse.bookmarks) && this.modified == wsBookmarkResponse.modified) {
            return true;
        }
        return false;
    }

    public final List<f> getBookmarks() {
        return this.bookmarks;
    }

    public final int getModified() {
        return this.modified;
    }

    public int hashCode() {
        return Integer.hashCode(this.modified) + (this.bookmarks.hashCode() * 31);
    }

    public String toString() {
        List<f> list = this.bookmarks;
        int i11 = this.modified;
        return "WsBookmarkResponse(bookmarks=" + list + ", modified=" + i11 + ")";
    }

    public WsBookmarkResponse(List<f> bookmarks, int i11) {
        u.j(bookmarks, "bookmarks");
        this.bookmarks = bookmarks;
        this.modified = i11;
    }

    public static /* synthetic */ void getBookmarks$annotations() {
    }

    public static /* synthetic */ void getModified$annotations() {
    }
}
