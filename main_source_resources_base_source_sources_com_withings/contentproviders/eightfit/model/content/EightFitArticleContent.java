package com.withings.contentproviders.eightfit.model.content;

import androidx.appcompat.widget.v0;
import com.samsung.android.sdk.healthdata.HealthConstants;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jivesoftware.smack.packet.Message;
/* compiled from: EightFitArticleContent.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BS\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b5\u00106Bq\b\u0011\u0012\u0006\u00107\u001a\u00020#\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b5\u0010:J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\rJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\rJl\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010\rJ\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0018\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b,\u0010\rR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\b.\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010+\u001a\u0004\b/\u0010\rR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b0\u0010\rR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b1\u0010\rR\u0017\u0010\u001d\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b2\u0010\rR\u0017\u0010\u001e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010+\u001a\u0004\b3\u0010\rR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b4\u0010\r¨\u0006="}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitArticleContent;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/content/EightFitArticleContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitTag;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "component7", "component8", "identifier", "tags", "title", HealthConstants.HealthDocument.AUTHOR, "authorLink", "featureImage", Message.BODY, HealthConstants.FoodInfo.DESCRIPTION, "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withings/contentproviders/eightfit/model/content/EightFitArticleContent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "Ljava/util/List;", "getTags", "getTitle", "getAuthor", "getAuthorLink", "getFeatureImage", "getBody", "getDescription", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class EightFitArticleContent extends EightFitContent {
    private final String author;
    private final String authorLink;
    private final String body;
    private final String description;
    private final String featureImage;
    private final String identifier;
    private final List<EightFitContent.EightFitTag> tags;
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(EightFitContent$EightFitTag$$serializer.INSTANCE), null, null, null, null, null, null};

    /* compiled from: EightFitArticleContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitArticleContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitArticleContent;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<EightFitArticleContent> serializer() {
            return EightFitArticleContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EightFitArticleContent(int i11, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        super(i11, serializationConstructorMarker);
        if (255 != (i11 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 255, EightFitArticleContent$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.tags = list;
        this.title = str2;
        this.author = str3;
        this.authorLink = str4;
        this.featureImage = str5;
        this.body = str6;
        this.description = str7;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EightFitArticleContent copy$default(EightFitArticleContent eightFitArticleContent, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        String str8;
        List<EightFitContent.EightFitTag> list2;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        if ((i11 & 1) != 0) {
            str8 = eightFitArticleContent.identifier;
        } else {
            str8 = str;
        }
        if ((i11 & 2) != 0) {
            list2 = eightFitArticleContent.tags;
        } else {
            list2 = list;
        }
        if ((i11 & 4) != 0) {
            str9 = eightFitArticleContent.title;
        } else {
            str9 = str2;
        }
        if ((i11 & 8) != 0) {
            str10 = eightFitArticleContent.author;
        } else {
            str10 = str3;
        }
        if ((i11 & 16) != 0) {
            str11 = eightFitArticleContent.authorLink;
        } else {
            str11 = str4;
        }
        if ((i11 & 32) != 0) {
            str12 = eightFitArticleContent.featureImage;
        } else {
            str12 = str5;
        }
        if ((i11 & 64) != 0) {
            str13 = eightFitArticleContent.body;
        } else {
            str13 = str6;
        }
        if ((i11 & 128) != 0) {
            str14 = eightFitArticleContent.description;
        } else {
            str14 = str7;
        }
        return eightFitArticleContent.copy(str8, list2, str9, str10, str11, str12, str13, str14);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(EightFitArticleContent eightFitArticleContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        EightFitContent.write$Self(eightFitArticleContent, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eightFitArticleContent.getIdentifier());
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], eightFitArticleContent.getTags());
        compositeEncoder.encodeStringElement(serialDescriptor, 2, eightFitArticleContent.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, eightFitArticleContent.author);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, eightFitArticleContent.authorLink);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, eightFitArticleContent.featureImage);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, eightFitArticleContent.body);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, eightFitArticleContent.description);
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
        return this.author;
    }

    public final String component5() {
        return this.authorLink;
    }

    public final String component6() {
        return this.featureImage;
    }

    public final String component7() {
        return this.body;
    }

    public final String component8() {
        return this.description;
    }

    public final EightFitArticleContent copy(String identifier, List<EightFitContent.EightFitTag> tags, String title, String str, String str2, String featureImage, String body, String str3) {
        u.j(identifier, "identifier");
        u.j(tags, "tags");
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(body, "body");
        return new EightFitArticleContent(identifier, tags, title, str, str2, featureImage, body, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EightFitArticleContent)) {
            return false;
        }
        EightFitArticleContent eightFitArticleContent = (EightFitArticleContent) obj;
        if (u.e(this.identifier, eightFitArticleContent.identifier) && u.e(this.tags, eightFitArticleContent.tags) && u.e(this.title, eightFitArticleContent.title) && u.e(this.author, eightFitArticleContent.author) && u.e(this.authorLink, eightFitArticleContent.authorLink) && u.e(this.featureImage, eightFitArticleContent.featureImage) && u.e(this.body, eightFitArticleContent.body) && u.e(this.description, eightFitArticleContent.description)) {
            return true;
        }
        return false;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getAuthorLink() {
        return this.authorLink;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getDescription() {
        return this.description;
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
        int hashCode;
        int hashCode2;
        int c11 = d.c(this.title, e.b(this.tags, this.identifier.hashCode() * 31, 31), 31);
        String str = this.author;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (c11 + hashCode) * 31;
        String str2 = this.authorLink;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int c12 = d.c(this.body, d.c(this.featureImage, (i12 + hashCode2) * 31, 31), 31);
        String str3 = this.description;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return c12 + i11;
    }

    public String toString() {
        String str = this.identifier;
        List<EightFitContent.EightFitTag> list = this.tags;
        String str2 = this.title;
        String str3 = this.author;
        String str4 = this.authorLink;
        String str5 = this.featureImage;
        String str6 = this.body;
        String str7 = this.description;
        StringBuilder sb2 = new StringBuilder("EightFitArticleContent(identifier=");
        sb2.append(str);
        sb2.append(", tags=");
        sb2.append(list);
        sb2.append(", title=");
        b.d(sb2, str2, ", author=", str3, ", authorLink=");
        b.d(sb2, str4, ", featureImage=", str5, ", body=");
        return v0.d(sb2, str6, ", description=", str7, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EightFitArticleContent(String identifier, List<EightFitContent.EightFitTag> tags, String title, String str, String str2, String featureImage, String body, String str3) {
        super(null);
        u.j(identifier, "identifier");
        u.j(tags, "tags");
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(body, "body");
        this.identifier = identifier;
        this.tags = tags;
        this.title = title;
        this.author = str;
        this.authorLink = str2;
        this.featureImage = featureImage;
        this.body = body;
        this.description = str3;
    }
}
