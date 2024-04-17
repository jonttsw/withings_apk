package com.withings.contentproviders.eightfit.model.content;

import androidx.camera.core.y1;
import com.withings.contentproviders.eightfit.model.content.EightFitContent;
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
/* compiled from: EightFitDiscoveryContent.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B5\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-BS\b\u0011\u0012\u0006\u0010.\u001a\u00020\u001d\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b,\u00101J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJH\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\rJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0015\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b&\u0010\rR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b(\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b)\u0010\rR\u0017\u0010\u0018\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b*\u0010\rR\u0017\u0010\u0019\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b+\u0010\r¨\u00064"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitDiscoveryContent;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/content/EightFitDiscoveryContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitTag;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "identifier", "tags", "title", "featureImage", Message.BODY, "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withings/contentproviders/eightfit/model/content/EightFitDiscoveryContent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "Ljava/util/List;", "getTags", "getTitle", "getFeatureImage", "getBody", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class EightFitDiscoveryContent extends EightFitContent {
    private final String body;
    private final String featureImage;
    private final String identifier;
    private final List<EightFitContent.EightFitTag> tags;
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(EightFitContent$EightFitTag$$serializer.INSTANCE), null, null, null};

    /* compiled from: EightFitDiscoveryContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitDiscoveryContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitDiscoveryContent;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<EightFitDiscoveryContent> serializer() {
            return EightFitDiscoveryContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EightFitDiscoveryContent(int i11, String str, List list, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        super(i11, serializationConstructorMarker);
        if (31 != (i11 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 31, EightFitDiscoveryContent$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.tags = list;
        this.title = str2;
        this.featureImage = str3;
        this.body = str4;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ EightFitDiscoveryContent copy$default(EightFitDiscoveryContent eightFitDiscoveryContent, String str, List list, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = eightFitDiscoveryContent.identifier;
        }
        List<EightFitContent.EightFitTag> list2 = list;
        if ((i11 & 2) != 0) {
            list2 = eightFitDiscoveryContent.tags;
        }
        List list3 = list2;
        if ((i11 & 4) != 0) {
            str2 = eightFitDiscoveryContent.title;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            str3 = eightFitDiscoveryContent.featureImage;
        }
        String str6 = str3;
        if ((i11 & 16) != 0) {
            str4 = eightFitDiscoveryContent.body;
        }
        return eightFitDiscoveryContent.copy(str, list3, str5, str6, str4);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(EightFitDiscoveryContent eightFitDiscoveryContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        EightFitContent.write$Self(eightFitDiscoveryContent, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eightFitDiscoveryContent.getIdentifier());
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], eightFitDiscoveryContent.getTags());
        compositeEncoder.encodeStringElement(serialDescriptor, 2, eightFitDiscoveryContent.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, eightFitDiscoveryContent.featureImage);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, eightFitDiscoveryContent.body);
    }

    public final String component1() {
        return this.identifier;
    }

    public final List<EightFitContent.EightFitTag> component2() {
        return this.tags;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.featureImage;
    }

    public final String component5() {
        return this.body;
    }

    public final EightFitDiscoveryContent copy(String identifier, List<EightFitContent.EightFitTag> tags, String title, String featureImage, String body) {
        u.j(identifier, "identifier");
        u.j(tags, "tags");
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(body, "body");
        return new EightFitDiscoveryContent(identifier, tags, title, featureImage, body);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EightFitDiscoveryContent)) {
            return false;
        }
        EightFitDiscoveryContent eightFitDiscoveryContent = (EightFitDiscoveryContent) obj;
        if (u.e(this.identifier, eightFitDiscoveryContent.identifier) && u.e(this.tags, eightFitDiscoveryContent.tags) && u.e(this.title, eightFitDiscoveryContent.title) && u.e(this.featureImage, eightFitDiscoveryContent.featureImage) && u.e(this.body, eightFitDiscoveryContent.body)) {
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

    @Override // com.withings.contentproviders.eightfit.model.content.EightFitContent
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // com.withings.contentproviders.eightfit.model.content.EightFitContent
    public List<EightFitContent.EightFitTag> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.body.hashCode() + d.c(this.featureImage, d.c(this.title, e.b(this.tags, this.identifier.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        String str = this.identifier;
        List<EightFitContent.EightFitTag> list = this.tags;
        String str2 = this.title;
        String str3 = this.featureImage;
        String str4 = this.body;
        StringBuilder sb2 = new StringBuilder("EightFitDiscoveryContent(identifier=");
        sb2.append(str);
        sb2.append(", tags=");
        sb2.append(list);
        sb2.append(", title=");
        b.d(sb2, str2, ", featureImage=", str3, ", body=");
        return y1.e(sb2, str4, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EightFitDiscoveryContent(String identifier, List<EightFitContent.EightFitTag> tags, String title, String featureImage, String body) {
        super(null);
        u.j(identifier, "identifier");
        u.j(tags, "tags");
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(body, "body");
        this.identifier = identifier;
        this.tags = tags;
        this.title = title;
        this.featureImage = featureImage;
        this.body = body;
    }
}
