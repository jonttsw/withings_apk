package com.withings.contentproviders.eightfit.model.webservice;

import com.samsung.android.sdk.healthdata.HealthConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jivesoftware.smack.packet.Message;
/* compiled from: WsArticleContent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/contentproviders/eightfit/model/webservice/WsArticleContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsArticleContent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/contentproviders/eightfit/model/webservice/WsArticleContent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/contentproviders/eightfit/model/webservice/WsArticleContent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "eightfit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsArticleContent$$serializer implements GeneratedSerializer<WsArticleContent> {
    public static final WsArticleContent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        WsArticleContent$$serializer wsArticleContent$$serializer = new WsArticleContent$$serializer();
        INSTANCE = wsArticleContent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.contentproviders.eightfit.model.webservice.WsArticleContent", wsArticleContent$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement(HealthConstants.HealthDocument.AUTHOR, false);
        pluginGeneratedSerialDescriptor.addElement("authorLink", false);
        pluginGeneratedSerialDescriptor.addElement("featureImage", false);
        pluginGeneratedSerialDescriptor.addElement(Message.BODY, false);
        pluginGeneratedSerialDescriptor.addElement("identifier", false);
        pluginGeneratedSerialDescriptor.addElement("tags", false);
        pluginGeneratedSerialDescriptor.addElement("contextualizedDescription", false);
        pluginGeneratedSerialDescriptor.addElement("contextualized", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WsArticleContent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = WsArticleContent.access$get$childSerializers$cp();
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, access$get$childSerializers$cp[6], BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(WsContextualized$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public WsArticleContent deserialize(Decoder decoder) {
        int i11;
        WsContextualized wsContextualized;
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] access$get$childSerializers$cp = WsArticleContent.access$get$childSerializers$cp();
        int i12 = 7;
        int i13 = 5;
        String str8 = null;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 3);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 4);
            String decodeStringElement4 = beginStructure.decodeStringElement(descriptor2, 5);
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 6, access$get$childSerializers$cp[6], null);
            str2 = decodeStringElement;
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            str7 = decodeStringElement4;
            str5 = decodeStringElement2;
            wsContextualized = (WsContextualized) beginStructure.decodeNullableSerializableElement(descriptor2, 8, WsContextualized$$serializer.INSTANCE, null);
            str6 = decodeStringElement3;
            str4 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            i11 = 511;
            str3 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
        } else {
            boolean z5 = true;
            int i14 = 0;
            WsContextualized wsContextualized2 = null;
            String str9 = null;
            List list2 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        i12 = 7;
                        break;
                    case 0:
                        str8 = beginStructure.decodeStringElement(descriptor2, 0);
                        i14 |= 1;
                        i12 = 7;
                        i13 = 5;
                        break;
                    case 1:
                        str10 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, str10);
                        i14 |= 2;
                        i12 = 7;
                        i13 = 5;
                        break;
                    case 2:
                        str11 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str11);
                        i14 |= 4;
                        i12 = 7;
                        i13 = 5;
                        break;
                    case 3:
                        str12 = beginStructure.decodeStringElement(descriptor2, 3);
                        i14 |= 8;
                        break;
                    case 4:
                        str13 = beginStructure.decodeStringElement(descriptor2, 4);
                        i14 |= 16;
                        break;
                    case 5:
                        str14 = beginStructure.decodeStringElement(descriptor2, i13);
                        i14 |= 32;
                        break;
                    case 6:
                        list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 6, access$get$childSerializers$cp[6], list2);
                        i14 |= 64;
                        break;
                    case 7:
                        str9 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, i12, StringSerializer.INSTANCE, str9);
                        i14 |= 128;
                        break;
                    case 8:
                        wsContextualized2 = (WsContextualized) beginStructure.decodeNullableSerializableElement(descriptor2, 8, WsContextualized$$serializer.INSTANCE, wsContextualized2);
                        i14 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i11 = i14;
            wsContextualized = wsContextualized2;
            str = str9;
            list = list2;
            str2 = str8;
            str3 = str10;
            str4 = str11;
            str5 = str12;
            str6 = str13;
            str7 = str14;
        }
        beginStructure.endStructure(descriptor2);
        return new WsArticleContent(i11, str2, str3, str4, str5, str6, str7, list, str, wsContextualized, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, WsArticleContent value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        WsArticleContent.write$Self$eightfit_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
