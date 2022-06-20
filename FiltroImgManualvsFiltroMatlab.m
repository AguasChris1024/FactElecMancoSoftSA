clc
close all
clear all

%Lectura/Carga de la imagen original
img = imread('img/Isa y Cami.jpeg');


%Ruido sintético para la imagen
imgRuido = imnoise(img, 'salt & pepper', 0.3);
imgAux = zeros(size(img));

figure(1);
imshow(imgRuido);

%División en 3 matrices espectrales
imgR = imgRuido(:, :, 1);
imgG = imgRuido(:, :, 2);
imgB = imgRuido(:, :, 3);

%Agregado de borde a cada espectro sustraído
imgRBorde = borde(imgR);
imgGBorde = borde(imgG);
imgBBorde = borde(imgB);

%Matrices auxiliares por cada espectro
imgRAux = zeros(size(imgR));
imgGAux = zeros(size(imgG));
imgBAux = zeros(size(imgB));

%Cálculo de media en cada espectro
dimension = 3;
inicio = 1;
fin = dimension;
col = dimension;
fil = dimension;

for i = 1 : size(imgRBorde, 1) - (dimension -1)
    for j = 1 : size(imgRBorde, 2) - (dimension - 1)
        imgRAux(i, j) = mean(mean(imgRBorde(inicio : fin, j : col)));
        imgGAux(i, j) = mean(mean(imgGBorde(inicio : fin, j : col)));
        imgBAux(i, j) = mean(mean(imgBBorde(inicio : fin, j : col)));
        col = col + 1;
    end
    col = dimension;
    fil =  fil + 1;
    inicio =  inicio + 1;
    fin = fin + 1;
end

%Asignación de matrices de medias
imgRMedia =  imgRAux;
imgGMedia =  imgGAux;
imgBMedia =  imgBAux;

%Construcción de la imagen con filtro de medias
imgFilterMean(:, :, 1) = uint8(imgRMedia);
imgFilterMean(:, :, 2) = uint8(imgGMedia);
imgFilterMean(:, :, 3) = uint8(imgBMedia);

%Mostrar imagen filtrada
figure(2);
imshow(imgFilterMean);

%--------------------------------------------------------------------------
%Cálculo de mediana para cada espectro

dimensionm = 3;
iniciom = 1;
finm = dimensionm;
colm = dimensionm;
film = dimensionm;

for k = 1 : size(imgRBorde, 1) - (dimensionm -1)
    for l = 1 : size(imgRBorde, 2) - (dimensionm - 1)
        imgRAux(k, l) = median(median(imgRBorde(iniciom : finm, l : colm)));
        imgGAux(k, l) = median(median(imgGBorde(iniciom : finm, l : colm)));
        imgBAux(k, l) = median(median(imgBBorde(iniciom : finm, l : colm)));
        colm = colm + 1;
    end
    colm = dimensionm;
    film =  film + 1;
    iniciom =  iniciom + 1;
    finm = finm + 1;
end

%Asignación de matrices de medianas
imgRMediana =  imgRAux;
imgGMediana =  imgGAux;
imgBMediana =  imgBAux;

%Construcción de la imagen con filtro de medias
imgFilterMedian(:, :, 1) = uint8(imgRMediana);
imgFilterMedian(:, :, 2) = uint8(imgGMediana);
imgFilterMedian(:, :, 3) = uint8(imgBMediana);

%Mostrar imagen filtrada
figure(3);
imshow(imgFilterMedian);

%--------------------------------------------------------------------------
%Filtro de Medias de Matlab
 %imgFilterMeanM = filter2(fspecial('average',3),imgRuido)/255;
 %figure(4)
 %imshow(imgFilterMeanM)

%Filtro de Medianas de Matlab
imgMediaFilterM = medfilt3(imgRuido,[3,3,3]);

figure(5)
imshow(imgMediaFilterM);
%imshowpair(imgFilterMeanM, imgMediaFilterM, 'montage');

%Función para agregado de borde a la matriz de las imágenes
function imgBorde = borde(img)
    col = ones(size(img,1),1);
    img = [col img col];
    fil = ones(1, size(img,2),1);
    img = [fil; img];
    imgBorde = [img; fil];
end