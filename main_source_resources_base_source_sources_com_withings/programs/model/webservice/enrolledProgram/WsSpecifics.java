package com.withings.programs.model.webservice.enrolledProgram;

import androidx.camera.camera2.internal.l0;
import com.google.gson.annotations.SerializedName;
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
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: WsSpecifics.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B-\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b'\u0010(BI\b\u0011\u0012\u0006\u0010)\u001a\u00020\u001a\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b'\u0010,J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b#\u0010\rR\u001a\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b$\u0010\rR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010\u0012¨\u0006/"}, d2 = {"Lcom/withings/programs/model/webservice/enrolledProgram/WsSpecifics;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/webservice/enrolledProgram/WsSpecifics;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "component2", "component3", "", "component4", "()Ljava/util/List;", "imagePreview", "imageFull", "title", "tags", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withings/programs/model/webservice/enrolledProgram/WsSpecifics;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImagePreview", "getImageFull", "getTitle", "Ljava/util/List;", "getTags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class WsSpecifics {
    @SerializedName("image_full")
    private final String imageFull;
    @SerializedName("image_preview")
    private final String imagePreview;
    @SerializedName("tags")
    private final List<String> tags;
    @SerializedName("title")
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* compiled from: WsSpecifics.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/webservice/enrolledProgram/WsSpecifics$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/webservice/enrolledProgram/WsSpecifics;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsSpecifics> serializer() {
            return WsSpecifics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsSpecifics(int i11, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i11 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 15, WsSpecifics$$serializer.INSTANCE.getDescriptor());
        }
        this.imagePreview = str;
        this.imageFull = str2;
        this.title = str3;
        this.tags = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsSpecifics copy$default(WsSpecifics wsSpecifics, String str, String str2, String str3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsSpecifics.imagePreview;
        }
        if ((i11 & 2) != 0) {
            str2 = wsSpecifics.imageFull;
        }
        if ((i11 & 4) != 0) {
            str3 = wsSpecifics.title;
        }
        if ((i11 & 8) != 0) {
            list = wsSpecifics.tags;
        }
        return wsSpecifics.copy(str, str2, str3, list);
    }

    public static final /* synthetic */ void write$Self$android_release(WsSpecifics wsSpecifics, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wsSpecifics.imagePreview);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, wsSpecifics.imageFull);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, wsSpecifics.title);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], wsSpecifics.tags);
    }

    public final String component1() {
        return this.imagePreview;
    }

    public final String component2() {
        return this.imageFull;
    }

    public final String component3() {
        return this.title;
    }

    public final List<String> component4() {
        return this.tags;
    }

    public final WsSpecifics copy(String imagePreview, String imageFull, String title, List<String> tags) {
        u.j(imagePreview, "imagePreview");
        u.j(imageFull, "imageFull");
        u.j(title, "title");
        u.j(tags, "tags");
        return new WsSpecifics(imagePreview, imageFull, title, tags);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsSpecifics)) {
            return false;
        }
        WsSpecifics wsSpecifics = (WsSpecifics) obj;
        if (u.e(this.imagePreview, wsSpecifics.imagePreview) && u.e(this.imageFull, wsSpecifics.imageFull) && u.e(this.title, wsSpecifics.title) && u.e(this.tags, wsSpecifics.tags)) {
            return true;
        }
        return false;
    }

    public final String getImageFull() {
        return this.imageFull;
    }

    public final String getImagePreview() {
        return this.imagePreview;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.tags.hashCode() + d.c(this.title, d.c(this.imageFull, this.imagePreview.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.imagePreview;
        String str2 = this.imageFull;
        String str3 = this.title;
        List<String> list = this.tags;
        StringBuilder b10 = l0.b("WsSpecifics(imagePreview=", str, ", imageFull=", str2, ", title=");
        b10.append(str3);
        b10.append(", tags=");
        b10.append(list);
        b10.append(")");
        return b10.toString();
    }

    public WsSpecifics(String imagePreview, String imageFull, String title, List<String> tags) {
        u.j(imagePreview, "imagePreview");
        u.j(imageFull, "imageFull");
        u.j(title, "title");
        u.j(tags, "tags");
        this.imagePreview = imagePreview;
        this.imageFull = imageFull;
        this.title = title;
        this.tags = tags;
    }
}
