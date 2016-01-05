import pygame
import color

pygame.init()

def drawTextField(Display, scr_width, scr_height, coloR=color.BLACK):
    pygame.draw.rect(Display,coloR,(scr_width/8,scr_height/5*3,scr_width/4*3,scr_height/15*4),8)
