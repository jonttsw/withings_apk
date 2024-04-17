package com.withings.contentproviders.eightfit.model.webservice;

import androidx.camera.camera2.internal.l0;
import com.google.gson.annotations.SerializedName;
import com.withings.contentproviders.eightfit.model.content.EightFitDiscoveryContent;
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
import org.jivesoftware.smack.packet.Message;
import zl.c;
/* compiled from: WsDiscoveryContent.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B5\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b/\u00100BS\b\u0011\u0012\u0006\u00101\u001a\u00020 \u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b/\u00104J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JH\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0010J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0018\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010(\u001a\u0004\b)\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b*\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010(\u001a\u0004\b+\u0010\u0010R\u001a\u0010\u001b\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b,\u0010\u0010R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010-\u001a\u0004\b.\u0010\u0017¨\u00067"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsDiscoveryContent;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContent;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/webservice/WsDiscoveryContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/withings/contentproviders/eightfit/model/content/EightFitDiscoveryContent;", "toEightFit", "()Lcom/withings/contentproviders/eightfit/model/content/EightFitDiscoveryContent;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "", "Lcom/withings/contentproviders/eightfit/model/webservice/WsTag;", "component5", "()Ljava/util/List;", "title", "featureImage", Message.BODY, "identifier", "tags", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withings/contentproviders/eightfit/model/webservice/WsDiscoveryContent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getFeatureImage", "getBody", "getIdentifier", "Ljava/util/List;", "getTags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class WsDiscoveryContent extends WsContent {
    @SerializedName(Message.BODY)
    private final String body;
    @SerializedName("feature_image")
    private final String featureImage;
    @SerializedName("identifier")
    private final String identifier;
    @SerializedName("tags")
    private final List<WsTag> tags;
    @SerializedName("title")
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(WsTag$$serializer.INSTANCE)};

    /* compiled from: WsDiscoveryContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsDiscoveryContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsDiscoveryContent;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsDiscoveryContent> serializer() {
            return WsDiscoveryContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WsDiscoveryContent(int i11, String str, String str2, String str3, String str4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(i11, serializationConstructorMarker);
        if (31 != (i11 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 31, WsDiscoveryContent$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.featureImage = str2;
        this.body = str3;
        this.identifier = str4;
        this.tags = list;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ WsDiscoveryContent copy$default(WsDiscoveryContent wsDiscoveryContent, String str, String str2, String str3, String str4, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsDiscoveryContent.title;
        }
        if ((i11 & 2) != 0) {
            str2 = wsDiscoveryContent.featureImage;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            str3 = wsDiscoveryContent.body;
        }
        String str6 = str3;
        if ((i11 & 8) != 0) {
            str4 = wsDiscoveryContent.identifier;
        }
        String str7 = str4;
        List<WsTag> list2 = list;
        if ((i11 & 16) != 0) {
            list2 = wsDiscoveryContent.tags;
        }
        return wsDiscoveryContent.copy(str, str5, str6, str7, list2);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(WsDiscoveryContent wsDiscoveryContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        WsContent.write$Self(wsDiscoveryContent, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wsDiscoveryContent.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, wsDiscoveryContent.featureImage);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, wsDiscoveryContent.body);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, wsDiscoveryContent.identifier);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], wsDiscoveryContent.tags);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.featureImage;
    }

    public final String component3() {
        return this.body;
    }

    public final String component4() {
        return this.identifier;
    }

    public final List<WsTag> component5() {
        return this.tags;
    }

    public final WsDiscoveryContent copy(String title, String featureImage, String body, String identifier, List<WsTag> tags) {
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(body, "body");
        u.j(identifier, "identifier");
        u.j(tags, "tags");
        return new WsDiscoveryContent(title, featureImage, body, identifier, tags);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsDiscoveryContent)) {
            return false;
        }
        WsDiscoveryContent wsDiscoveryContent = (WsDiscoveryContent) obj;
        if (u.e(this.title, wsDiscoveryContent.title) && u.e(this.featureImage, wsDiscoveryContent.featureImage) && u.e(this.body, wsDiscoveryContent.body) && u.e(this.identifier, wsDiscoveryContent.identifier) && u.e(this.tags, wsDiscoveryContent.tags)) {
            return true;
        }
        return false;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getFeatureImage() {
        return this.featureImage;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final List<WsTag> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.tags.hashCode() + d.c(this.identifier, d.c(this.body, d.c(this.featureImage, this.title.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.featureImage;
        String str3 = this.body;
        String str4 = this.identifier;
        List<WsTag> list = this.tags;
        StringBuilder b10 = l0.b("WsDiscoveryContent(title=", str, ", featureImage=", str2, ", body=");
        b.d(b10, str3, ", identifier=", str4, ", tags=");
        return d.i(b10, list, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WsDiscoveryContent(String title, String featureImage, String body, String identifier, List<WsTag> tags) {
        super(null);
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(body, "body");
        u.j(identifier, "identifier");
        u.j(tags, "tags");
        this.title = title;
        this.featureImage = featureImage;
        this.body = body;
        this.identifier = identifier;
        this.tags = tags;
    }

    @Override // com.withings.contentproviders.eightfit.model.webservice.WsContent
    public EightFitDiscoveryContent toEightFit() {
        return new EightFitDiscoveryContent(this.identifier, c.d(this.tags), this.title, this.featureImage, this.body);
    }
}
