# !/user/bin/python3
# -*- coding: utf-8 -*-

'''
 Unix/Linux操作系统提供了一个fork()系统调用，
 它非常特殊。普通的函数调用，调用一次，返回一次，但是fork()调用一次，返回两次，
 因为操作系统自动把当前进程（称为父进程）复制了一份（称为子进程），
 然后，分别在父进程和子进程内返回。
 子进程永远返回0，而父进程返回子进程的ID。
 这样做的理由是，一个父进程可以fork出很多子进程，
 所以，父进程要记下每个子进程的ID，而子进程只需要调用getppid()就可以拿到父进程的ID。
'''
import os
# 获取父进程 ID

print(os.getpid())
# ps: window不提供fork() 如果要开发多进程，不建议使用window系统
# pid = os.fork()

from multiprocessing import Process

# 子进程执行函数
def run_process(name):
    print('Run child process %s (%s)...' % (name, os.getpid()))
    
if __name__ == '__main__':
    print('Parent process %s' % os.getpid())
    p = Process(target=run_process, args=('test',))
    print('Child process will start')
    p.start()
    p.join()
    print('Child process end')