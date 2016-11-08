import json
tips='07'
data={}
data['tips']=[]
line={}
line['type']='text'
line['content']='Did you konw you can use the Spacebar to switch between filled spaces and Xs?'
data['tips'].append(line)

json.dump(data,open('tips/'+ tips +'.json','w'),sort_keys=True)
