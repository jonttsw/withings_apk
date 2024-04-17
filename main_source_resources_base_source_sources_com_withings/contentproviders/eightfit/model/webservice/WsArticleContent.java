package com.withings.contentproviders.eightfit.model.webservice;

import androidx.camera.camera2.internal.l0;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.contentproviders.eightfit.model.content.EightFitArticleContent;
import dp0.j;
import java.util.ArrayList;
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
import zl.c;
/* compiled from: WsArticleContent.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDB]\u0012\u0006\u0010\u001e\u001a\u00020\u000e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010!\u001a\u00020\u000e\u0012\u0006\u0010\"\u001a\u00020\u000e\u0012\u0006\u0010#\u001a\u00020\u000e\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\u0010%\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010&\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b>\u0010?B{\b\u0011\u0012\u0006\u0010@\u001a\u00020*\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000e\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\u0010%\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010&\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\b>\u0010CJ(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0010J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJx\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u000e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010!\u001a\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020\u000e2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010\u0010J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u001a\u0010\u001e\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\b3\u0010\u0010R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00102\u001a\u0004\b4\u0010\u0010R\u001c\u0010 \u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u00102\u001a\u0004\b5\u0010\u0010R\u001a\u0010!\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u00102\u001a\u0004\b6\u0010\u0010R\u001a\u0010\"\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00102\u001a\u0004\b7\u0010\u0010R\u001a\u0010#\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u00102\u001a\u0004\b8\u0010\u0010R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u00109\u001a\u0004\b:\u0010\u0019R\u001c\u0010%\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u00102\u001a\u0004\b;\u0010\u0010R\u001c\u0010&\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010<\u001a\u0004\b=\u0010\u001d¨\u0006F"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsArticleContent;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContent;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/webservice/WsArticleContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/withings/contentproviders/eightfit/model/content/EightFitArticleContent;", "toEightFit", "()Lcom/withings/contentproviders/eightfit/model/content/EightFitArticleContent;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "", "Lcom/withings/contentproviders/eightfit/model/webservice/WsTag;", "component7", "()Ljava/util/List;", "component8", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "component9", "()Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "title", HealthConstants.HealthDocument.AUTHOR, "authorLink", "featureImage", Message.BODY, "identifier", "tags", "contextualizedDescription", "contextualized", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;)Lcom/withings/contentproviders/eightfit/model/webservice/WsArticleContent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getAuthor", "getAuthorLink", "getFeatureImage", "getBody", "getIdentifier", "Ljava/util/List;", "getTags", "getContextualizedDescription", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "getContextualized", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class WsArticleContent extends WsContent {
    @SerializedName(HealthConstants.HealthDocument.AUTHOR)
    private final String author;
    @SerializedName("author_link")
    private final String authorLink;
    @SerializedName(Message.BODY)
    private final String body;
    @SerializedName("contextualized")
    private final WsContextualized contextualized;
    @SerializedName("contextualized_description")
    private final String contextualizedDescription;
    @SerializedName("feature_image")
    private final String featureImage;
    @SerializedName("identifier")
    private final String identifier;
    @SerializedName("tags")
    private final List<WsTag> tags;
    @SerializedName("title")
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(WsTag$$serializer.INSTANCE), null, null};

    /* compiled from: WsArticleContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsArticleContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsArticleContent;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsArticleContent> serializer() {
            return WsArticleContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WsArticleContent(int i11, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, WsContextualized wsContextualized, SerializationConstructorMarker serializationConstructorMarker) {
        super(i11, serializationConstructorMarker);
        if (511 != (i11 & 511)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 511, WsArticleContent$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.author = str2;
        this.authorLink = str3;
        this.featureImage = str4;
        this.body = str5;
        this.identifier = str6;
        this.tags = list;
        this.contextualizedDescription = str7;
        this.contextualized = wsContextualized;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsArticleContent copy$default(WsArticleContent wsArticleContent, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, WsContextualized wsContextualized, int i11, Object obj) {
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        List<WsTag> list2;
        String str14;
        WsContextualized wsContextualized2;
        if ((i11 & 1) != 0) {
            str8 = wsArticleContent.title;
        } else {
            str8 = str;
        }
        if ((i11 & 2) != 0) {
            str9 = wsArticleContent.author;
        } else {
            str9 = str2;
        }
        if ((i11 & 4) != 0) {
            str10 = wsArticleContent.authorLink;
        } else {
            str10 = str3;
        }
        if ((i11 & 8) != 0) {
            str11 = wsArticleContent.featureImage;
        } else {
            str11 = str4;
        }
        if ((i11 & 16) != 0) {
            str12 = wsArticleContent.body;
        } else {
            str12 = str5;
        }
        if ((i11 & 32) != 0) {
            str13 = wsArticleContent.identifier;
        } else {
            str13 = str6;
        }
        if ((i11 & 64) != 0) {
            list2 = wsArticleContent.tags;
        } else {
            list2 = list;
        }
        if ((i11 & 128) != 0) {
            str14 = wsArticleContent.contextualizedDescription;
        } else {
            str14 = str7;
        }
        if ((i11 & 256) != 0) {
            wsContextualized2 = wsArticleContent.contextualized;
        } else {
            wsContextualized2 = wsContextualized;
        }
        return wsArticleContent.copy(str8, str9, str10, str11, str12, str13, list2, str14, wsContextualized2);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(WsArticleContent wsArticleContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        WsContent.write$Self(wsArticleContent, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wsArticleContent.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, wsArticleContent.author);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, wsArticleContent.authorLink);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, wsArticleContent.featureImage);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, wsArticleContent.body);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, wsArticleContent.identifier);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], wsArticleContent.tags);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, wsArticleContent.contextualizedDescription);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, WsContextualized$$serializer.INSTANCE, wsArticleContent.contextualized);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.author;
    }

    public final String component3() {
        return this.authorLink;
    }

    public final String component4() {
        return this.featureImage;
    }

    public final String component5() {
        return this.body;
    }

    public final String component6() {
        return this.identifier;
    }

    public final List<WsTag> component7() {
        return this.tags;
    }

    public final String component8() {
        return this.contextualizedDescription;
    }

    public final WsContextualized component9() {
        return this.contextualized;
    }

    public final WsArticleContent copy(String title, String str, String str2, String featureImage, String body, String identifier, List<WsTag> tags, String str3, WsContextualized wsContextualized) {
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(body, "body");
        u.j(identifier, "identifier");
        u.j(tags, "tags");
        return new WsArticleContent(title, str, str2, featureImage, body, identifier, tags, str3, wsContextualized);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsArticleContent)) {
            return false;
        }
        WsArticleContent wsArticleContent = (WsArticleContent) obj;
        if (u.e(this.title, wsArticleContent.title) && u.e(this.author, wsArticleContent.author) && u.e(this.authorLink, wsArticleContent.authorLink) && u.e(this.featureImage, wsArticleContent.featureImage) && u.e(this.body, wsArticleContent.body) && u.e(this.identifier, wsArticleContent.identifier) && u.e(this.tags, wsArticleContent.tags) && u.e(this.contextualizedDescription, wsArticleContent.contextualizedDescription) && u.e(this.contextualized, wsArticleContent.contextualized)) {
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

    public final WsContextualized getContextualized() {
        return this.contextualized;
    }

    public final String getContextualizedDescription() {
        return this.contextualizedDescription;
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
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.title.hashCode() * 31;
        String str = this.author;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode4 + hashCode) * 31;
        String str2 = this.authorLink;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int b10 = e.b(this.tags, d.c(this.identifier, d.c(this.body, d.c(this.featureImage, (i12 + hashCode2) * 31, 31), 31), 31), 31);
        String str3 = this.contextualizedDescription;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (b10 + hashCode3) * 31;
        WsContextualized wsContextualized = this.contextualized;
        if (wsContextualized != null) {
            i11 = wsContextualized.hashCode();
        }
        return i13 + i11;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.author;
        String str3 = this.authorLink;
        String str4 = this.featureImage;
        String str5 = this.body;
        String str6 = this.identifier;
        List<WsTag> list = this.tags;
        String str7 = this.contextualizedDescription;
        WsContextualized wsContextualized = this.contextualized;
        StringBuilder b10 = l0.b("WsArticleContent(title=", str, ", author=", str2, ", authorLink=");
        b.d(b10, str3, ", featureImage=", str4, ", body=");
        b.d(b10, str5, ", identifier=", str6, ", tags=");
        b10.append(list);
        b10.append(", contextualizedDescription=");
        b10.append(str7);
        b10.append(", contextualized=");
        b10.append(wsContextualized);
        b10.append(")");
        return b10.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WsArticleContent(String title, String str, String str2, String featureImage, String body, String identifier, List<WsTag> tags, String str3, WsContextualized wsContextualized) {
        super(null);
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(body, "body");
        u.j(identifier, "identifier");
        u.j(tags, "tags");
        this.title = title;
        this.author = str;
        this.authorLink = str2;
        this.featureImage = featureImage;
        this.body = body;
        this.identifier = identifier;
        this.tags = tags;
        this.contextualizedDescription = str3;
        this.contextualized = wsContextualized;
    }

    @Override // com.withings.contentproviders.eightfit.model.webservice.WsContent
    public EightFitArticleContent toEightFit() {
        String str;
        String str2 = this.identifier;
        ArrayList d11 = c.d(this.tags);
        String str3 = this.title;
        String str4 = this.featureImage;
        String str5 = this.authorLink;
        String str6 = null;
        String str7 = (str5 == null || j.D(str5)) ? null : str5;
        String str8 = this.author;
        if (str8 != null && !j.D(str8)) {
            str6 = str8;
        }
        String str9 = this.body;
        WsContextualized wsContextualized = this.contextualized;
        if (wsContextualized == null || (str = wsContextualized.getDescription()) == null) {
            str = this.contextualizedDescription;
        }
        return new EightFitArticleContent(str2, d11, str3, str6, str7, str4, str9, str);
    }
}
