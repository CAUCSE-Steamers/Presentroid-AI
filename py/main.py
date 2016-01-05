import pygame
import color, font, textField

pygame.init()
programFlag = True

scr_width=800
scr_height=480
scr_size=(scr_width,scr_height)

x=100
y=200

mainDisplay = pygame.display.set_mode(scr_size)
pygame.display.set_caption('test1')
clock = pygame.time.Clock()

testImg=pygame.image.load('testimg.png')

TextSurf=font.normalFont.render("abc",True,color.RED)
TextRect=TextSurf.get_rect()
TextRect.center=(scr_width/2,scr_height/2)

while programFlag:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            programFlag=False
        if event.type == pygame.KEYDOWN:
            if event.key==pygame.K_UP:
                y=y-5
            if event.key==pygame.K_a:
                TextSurf=font.normalFont.render("abc",True,color.BLUE)


    mainDisplay.fill(color.WHITE)
    textField.drawTextField(mainDisplay,scr_width,scr_height)
    mainDisplay.blit(testImg,(x,y))
    mainDisplay.blit(TextSurf,TextRect)

    pygame.display.update()
    clock.tick(30)

pygame.quit()
