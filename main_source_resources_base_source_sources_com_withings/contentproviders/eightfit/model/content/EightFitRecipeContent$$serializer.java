package com.withings.contentproviders.eightfit.model.content;

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
/* compiled from: EightFitRecipeContent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/contentproviders/eightfit/model/content/EightFitRecipeContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "eightfit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EightFitRecipeContent$$serializer implements GeneratedSerializer<EightFitRecipeContent> {
    public static final EightFitRecipeContent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EightFitRecipeContent$$serializer eightFitRecipeContent$$serializer = new EightFitRecipeContent$$serializer();
        INSTANCE = eightFitRecipeContent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.contentproviders.eightfit.model.content.EightFitRecipeContent", eightFitRecipeContent$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("identifier", false);
        pluginGeneratedSerialDescriptor.addElement("tags", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("featureImage", false);
        pluginGeneratedSerialDescriptor.addElement(HealthConstants.FoodInfo.DESCRIPTION, false);
        pluginGeneratedSerialDescriptor.addElement("nutritionalValue", false);
        pluginGeneratedSerialDescriptor.addElement("ingredients", false);
        pluginGeneratedSerialDescriptor.addElement("instructions", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EightFitRecipeContent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = EightFitRecipeContent.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, kSerializerArr[1], stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[5], kSerializerArr[6], kSerializerArr[7]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public EightFitRecipeContent deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        List list;
        List list2;
        List list3;
        String str;
        String str2;
        List list4;
        String str3;
        String str4;
        char c11;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = EightFitRecipeContent.$childSerializers;
        int i12 = 7;
        String str5 = null;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 2);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 3);
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], null);
            str2 = decodeStringElement;
            str4 = decodeStringElement3;
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, null);
            str3 = decodeStringElement2;
            i11 = 255;
            list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            list3 = (List) beginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            list4 = (List) beginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
        } else {
            boolean z5 = true;
            int i13 = 0;
            List list5 = null;
            List list6 = null;
            List list7 = null;
            String str6 = null;
            List list8 = null;
            String str7 = null;
            String str8 = null;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        i12 = 7;
                    case 0:
                        str5 = beginStructure.decodeStringElement(descriptor2, 0);
                        i13 |= 1;
                        i12 = 7;
                    case 1:
                        list8 = (List) beginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], list8);
                        i13 |= 2;
                        i12 = 7;
                    case 2:
                        i13 |= 4;
                        str7 = beginStructure.decodeStringElement(descriptor2, 2);
                        i12 = 7;
                    case 3:
                        c11 = 4;
                        str8 = beginStructure.decodeStringElement(descriptor2, 3);
                        i13 |= 8;
                        i12 = 7;
                    case 4:
                        c11 = 4;
                        str6 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str6);
                        i13 |= 16;
                        i12 = 7;
                    case 5:
                        list7 = (List) beginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], list7);
                        i13 |= 32;
                    case 6:
                        list6 = (List) beginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], list6);
                        i13 |= 64;
                    case 7:
                        list5 = (List) beginStructure.decodeSerializableElement(descriptor2, i12, kSerializerArr[i12], list5);
                        i13 |= 128;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i11 = i13;
            list = list5;
            list2 = list6;
            list3 = list7;
            str = str6;
            str2 = str5;
            list4 = list8;
            str3 = str7;
            str4 = str8;
        }
        beginStructure.endStructure(descriptor2);
        return new EightFitRecipeContent(i11, str2, list4, str3, str4, str, list3, list2, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, EightFitRecipeContent value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        EightFitRecipeContent.write$Self$eightfit_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
